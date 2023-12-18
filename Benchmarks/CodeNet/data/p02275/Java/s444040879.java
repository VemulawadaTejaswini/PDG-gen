import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    public void exec_body( BufferedReader bf ) throws IOException {
		bf.readLine();
		String line = bf.readLine();
		int[] ary = toIList(line);
		int maxVal = max(ary);
		int[] ret = countingSort(ary, maxVal);

		for( int val : ret ) {
			System.out.println(val);
		}
    }

//    public void exec_body( BufferedReader bf ) throws IOException {
//		int[] ary = {};
//		int maxVal = max(ary);
//		int[] ret = countingSort(ary, maxVal);
//
//		for( int val : ret ) {
//			System.out.println(val);
//		}
//    }

    public int max( int[] ary ) {
    		int maxVal = 0;
    		for( int ii = 1; ii < ary.length; ii++ ) {
    			if( ary[ii] > maxVal ) {
    				maxVal = ary[ii];
    			}
    		}

    		return maxVal;
    }

    public int[] countingSort( int[] ary, int maxVal ) {
    		int[] counts = new int[maxVal+1];
    		for( int ii = 0; ii <= maxVal; ii++ ) {
    			counts[ary[ii]]++;
    		}

    		for( int ii = 1; ii <= maxVal; ii++ ) {
    			counts[ii] = counts[ii] + counts[ii-1];
    		}

    		int[] ret = new int[ary.length];
    		for( int ii = ary.length-1; ii >= 0; ii-- ) {
    			ret[counts[ary[ii]]] = ary[ii];
    			counts[ary[ii]]--;
    		}

    		return ret;
    }

    public static int[] toIList( String str ) {
        String[] elements = str.split(" ");
        int[] ret = new int [elements.length];
        for( int i = 0; i < elements.length; i++ ) {
            ret[i] = Integer.valueOf(elements[i]);
        }

        return ret;
    }

    public static void printI( int[] ary ) {
    		if( ary == null || ary.length == 0 ) {
    			return;
    		}

    		StringBuilder bd = new StringBuilder();
    		for( int i = 0; i < ary.length; i++ ) {
    			if( i != 0 ) {
    				bd.append(" ");
    			}
    			bd.append(ary[i]);
    		}

    		System.out.println(bd.toString());
    }
}
