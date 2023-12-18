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
		long[] ary = toIList(line);
		long maxVal = max(ary);
		long[] ret = countingSort(ary, maxVal);

		for( long val : ret ) {
			System.out.println(val);
		}
    }

    public long max( long[] ary ) {
    		long maxVal = 0;
    		for( long ii = 1; ii < ary.length; ii++ ) {
    			if( ary[ii] > maxVal ) {
    				maxVal = ary[ii];
    			}
    		}

    		return maxVal;
    }

    public long[] countingSort( long[] ary, long maxVal ) {
    		long[] counts = new long[maxVal+1];
    		for( long ii = 0; ii <= maxVal; ii++ ) {
    			counts[ary[ii]]++;
    		}

    		for( long ii = 1; ii <= maxVal; ii++ ) {
    			counts[ii] = counts[ii] + counts[ii-1];
    		}

    		long[] ret = new long[ary.length];
    		for( long ii = ary.length-1; ii >= 0; ii-- ) {
    			ret[counts[ary[ii]]] = ary[ii];
    			counts[ary[ii]]--;
    		}

    		return ret;
    }

    public static long[] toIList( String str ) {
        String[] elements = str.split(" ");
        long[] ret = new long [elements.length];
        for( int i = 0; i < elements.length; i++ ) {
            ret[i] = Long.valueOf(elements[i]);
        }

        return ret;
    }

    public static void printI( long[] ary ) {
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
