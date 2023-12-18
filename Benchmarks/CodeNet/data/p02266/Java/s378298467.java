import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
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

    public String omitString( String line ) {
		ArrayList<String> charList = new ArrayList<>();
		// 計算に不要な部分を最初に除く
		boolean isFirst = true;
		for( int i = 0; i < line.length(); i++ ) {
			char ch = line.charAt(i);
			if( isFirst && ch == '/' ) {
				continue;
			}

			isFirst = false;
			charList.add(String.valueOf(ch));
		}

		isFirst = true;
		ArrayList<String> charList2 = new ArrayList<>();
		for( int i = charList.size() -1; i >= 0; i-- ) {
			String ch = charList.get(i);
			if( isFirst && ch.equals("\\") ) {
				continue;
			}

			isFirst = false;
			charList2.add(ch);
		}

		StringBuilder bd = new StringBuilder();
		for( int i = charList2.size() -1; i >= 0; i--  )
		{
			String ch = charList2.get(i);
			bd.append(ch);
		}

		return bd.toString();
    }

    public void exec_body( BufferedReader bf ) throws IOException {
    		String line = bf.readLine();
    		line = omitString(line);

    		Stack<Boolean> charStack = new Stack<>();
    		int dimension = 0;
    		ArrayList<Integer> dimensionList = new ArrayList<>();
    		for( int i = 0; i < line.length(); i++ ) {
    			char ch = line.charAt(i);
    			if( ch == '\\' ) {
    				dimension = dimension + 1 + 2 * charStack.size();
    				charStack.push(Boolean.TRUE);
    			} else if( ch == '_') {
    				dimension = dimension + 2 * charStack.size();
    			} else {
    				if( charStack.size() == 0 ) {
        				continue;
    				}

    				charStack.pop();
    				dimension = dimension + 1 + 2 * charStack.size();
    				if( charStack.size() != 0 ) {
    					continue;
    				}

    				// listに入れて初期化する
    				dimensionList.add(Integer.valueOf(dimension));
    				dimension = 0;
    			}
    		}
    		if( dimension != 0 ) {
    			// 逆から計算し直して、1つめの水たまりでやめる
        		charStack = new Stack<>();
        		dimension = 0;
    			for( int i = line.length() -1; i >= 0; i--) {
        			char ch = line.charAt(i);
        			if( ch == '/' ) {
        				dimension = dimension + 1 + 2 * charStack.size();
        				charStack.push(Boolean.TRUE);
        			} else if( ch == '_') {
        				dimension = dimension + 2 * charStack.size();
        			} else {
        				if( charStack.size() == 0 ) {
            				continue;
        				}

        				charStack.pop();
        				dimension = dimension + 1 + 2 * charStack.size();
        				if( charStack.size() != 0 ) {
        					continue;
        				}

        				break;
        			}
    			}
    			dimensionList.add(Integer.valueOf(dimension));
    		}

    		int sum = 0;
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
