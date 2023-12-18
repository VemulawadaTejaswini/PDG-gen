import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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

    public ArrayList<Integer> toList( String line ) {
    		ArrayList<Integer> list = new ArrayList<>();
    		if ( line == null || line.length() == 0 ) {
    			return list;
    		}

    		String[] lines = line.split(" ");
    		for( int i = 0; i < lines.length; i++ ) {
    			String element = lines[i];
    			list.add(Integer.valueOf(element));
    		}

    		return list;
    }

    public boolean isCalculable( int mVal, int max, int flag, ArrayList<Integer> aList ) {
    		if( flag < max ) {
    			return false;
    		}

    		int curVal = 0;
    		for( int ii = 0; ii < aList.size(); ii++ ) {
    			int iiFlag = ( flag >>> ii ) & 0b01;
    			if( iiFlag == 0b01 ) {
    				curVal = curVal + aList.get(ii);
    			}
    		}
    		if( mVal == curVal ) {
    			return true;
    		}

    		return isCalculable(mVal,max,flag+1,aList);
    }

    public void exec_body( BufferedReader bf ) throws IOException {
    		bf.readLine();
    		ArrayList<Integer> aList = toList(bf.readLine());
    		bf.readLine();
    		ArrayList<Integer> mList = toList(bf.readLine());

    		for( Integer mVal : mList ) {
    			boolean isCalculable = isCalculable(mVal.intValue(),(int)Math.pow(2, aList.size()),0,aList);
    			String msg = isCalculable ? "yes" : "no";
    			System.out.println(msg);
    		}
    }
}
