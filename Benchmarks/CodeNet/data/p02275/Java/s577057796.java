import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public int cnt = 0;
	public static final BigDecimal TWO = new BigDecimal(2);
	public static final BigDecimal THREE = new BigDecimal(3);

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

    public void exec_body( BufferedReader bf )  {
    	String line = null;
    		try {
				bf.readLine();
	    			line = bf.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
    		int[] vals = toIList(line);

    		// 配列の初期化
    		int maxVal = max(vals);
    		int minVal = min(vals);
    		int[] counts = new int[maxVal-minVal+1];
    		for( int ii = 0; ii < counts.length; ii++ ) {
    			counts[ii] = 0;
    		}

    		// 計数
    		for( int ii = 0; ii < vals.length; ii++ ) {
    			int val = vals[ii];
    			counts[val-minVal]++;
    		}

    		// 足す
    		for( int ii = 1; ii < counts.length; ii++ ) {
    			counts[ii] = counts[ii] + counts[ii-1];
    		}

    		// sort処理を行う
    		int[] ans = new int[vals.length];
    		for( int ii = vals.length -1; ii >= 0; ii-- ) {
    			ans[counts[vals[ii]-minVal]-1] = vals[ii];
    			counts[vals[ii]-minVal]--;
    		}

    		print(ans);
    }

    public int max( int[] ary ) {
    		int ret = Integer.MIN_VALUE;
    		for( int ii = 0; ii < ary.length; ii++ ) {
    			if( ret < ary[ii] ) {
    				ret = ary[ii];
    			}
    		}

    		return ret;
    }

    public int min( int[] ary ) {
		int ret = Integer.MAX_VALUE;
		for( int ii = 0; ii < ary.length; ii++ ) {
			if( ret > ary[ii] ) {
				ret = ary[ii];
			}
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

    public static void print( int[] ary ) {
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
