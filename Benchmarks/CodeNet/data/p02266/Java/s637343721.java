import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * 境界部分には気をつける(そこだけ別で処理するというのもあり)
 * 逆再生することで簡単になることもある
 */
public class Main {
    public Main() {
    }

    public static void main(String[] args ) {
    		Main main = new Main();
    		main.exec();
    }

    public void exec() {
        BufferedReader bf = null;
        try{
            bf = new BufferedReader(new InputStreamReader(System.in));
            exec_body(bf);
        } catch (IOException e) {
			e.printStackTrace();
		}
        finally{
            if( bf != null ) {
                try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
            }
        }
    }

    public class CalcResult {
    		private LinkedList<String> _strList = null;
    		private LinkedList<Integer> _dimensionListFirst = null;
    		private LinkedList<Integer> _dimensionListLast = null;
    }

    public int countPosition( LinkedList<String> strList ) {
    		int position = 0;
    		Iterator<String> ite = strList.iterator();
    		while( ite.hasNext() ) {
    			String s = ite.next();
    			if( "/".equals(s)) {
    				position++;
    			} else if( "\\".equals(s)) {
    				position--;
    			}
    		}

    		return position;
    }

    public void calc( CalcResult result ) {
    		LinkedList<String> strList = result._strList;
    		boolean fromFirst = countPosition(strList) >= 0;
    		int dimension = 0;
    		int position = 0;
    		while( !strList.isEmpty() ) {
    			String s = ( fromFirst ) ? strList.pollFirst() : strList.pollLast();
    			if( "_".equals(s)) {
    				dimension = dimension + 2 * Math.abs(position);
    			} else if( ( fromFirst && "\\".equals(s) ) || ( !fromFirst && "/".equals(s)) ) {
    				dimension = 1 + dimension + 2 * Math.abs(position);
    				position--;
    			} else {
    				position++;
    				dimension = 1 + dimension + 2 * Math.abs(position);
    				if( position != 0 ) {
    					continue;
    				}

    				if( fromFirst ) {
    					result._dimensionListFirst.add(dimension);
    				} else {
    					result._dimensionListLast.addFirst(dimension);
    				}
    				break;
    			}
    		}
    }

    public void omitString( LinkedList<String> strList ) {
		while( !strList.isEmpty() ) {
			String s = strList.peekFirst();
			if( "\\".equals(s) ) {
				break;
			}

			strList.pollFirst();
		}

		while( !strList.isEmpty() ) {
			String s = strList.peekLast();
			if(  "/".equals(s) ) {
				break;
			}

			strList.pollLast();
		}
    }

    public LinkedList<String> toList( String str ) {
    		LinkedList<String> list = new LinkedList<>();
    		for( int ii = 0; ii < str.length(); ii++ ) {
    			char ch = str.charAt(ii);
    			list.add(String.valueOf(ch));
    		}

    		return list;
    }

    public void exec_body( BufferedReader bf ) throws IOException {
    		String line = bf.readLine();
    		LinkedList<String> strList = toList(line);
    		CalcResult result = new CalcResult();
    		result._strList = strList;
    		result._dimensionListFirst = new LinkedList<>();
    		result._dimensionListLast = new LinkedList<>();

    		while( !result._strList.isEmpty() ) {
    			omitString(result._strList);
    			calc(result);
    		}

    		int sum = 0;
    		ArrayList<Integer> dimensionList = new ArrayList<>();
    		dimensionList.addAll(result._dimensionListFirst);
    		dimensionList.addAll(result._dimensionListLast);
    		for( int i = 0; i < dimensionList.size(); i++ ) {
    			sum = sum + dimensionList.get(i);
    		}
    		System.out.println(sum/2);

    		// 結果を出力する
    		StringBuilder bd = new StringBuilder();
    		bd.append(dimensionList.size());
    		for( int i = 0; i < dimensionList.size(); i++ ) {
    			bd.append(" ");
    			bd.append(dimensionList.get(i)/2);
    		}
    		System.out.println(bd.toString());
    }
}
