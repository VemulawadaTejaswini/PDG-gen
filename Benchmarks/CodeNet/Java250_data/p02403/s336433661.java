import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader breader = getReader();

		int[] ary = getAry(breader);
		while( ary[0] != 0 || ary[1] !=0 ) {
			for( int i = 0 ;  i < ary[0] ; i++ ) {
				for( int j = 0 ; j < ary[1] ; j++ ) {
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
			ary = getAry(breader);
		}
	}
	public static BufferedReader getReader() {
		return( new BufferedReader(new InputStreamReader(System.in)));
	}
	public static int[] getAry(BufferedReader br)throws Exception {
		String line = br.readLine();
		String[] nstr = line.split(" ");
		int[] n = new int[nstr.length];
		for( int i=0 ; i < nstr.length ; i++ ) {
			n[i] = Integer.valueOf(nstr[i]);
		}
		return n;
	}

}