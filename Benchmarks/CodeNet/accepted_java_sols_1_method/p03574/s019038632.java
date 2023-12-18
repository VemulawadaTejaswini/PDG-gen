import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt(); in.nextLine();
		
		char[][] ary = new char[h+2][w+2];
		String tempS = "";
		
		for ( char[] row : ary ) {
			Arrays.fill(row, '?');
		}
		
		for ( int i = 0; i < h; i++ ) {
			tempS = in.nextLine();
			for ( int j = 0; j < w; j++ ) {
				ary[i+1][j+1] = tempS.charAt(j);
			}
		}
		
		// System.out.println(Arrays.deepToString(ary));
		String[][] newAry = new String[h][w];
		int ctr = 0;
		int newAryH = 0;
		int newAryW = 0;
		for ( int i = 0; i < h+1; i++ ) {
			for ( int j = 0; j < w+1; j++ ) {
				if ( ary[i][j] == '#' ) {
					newAry[newAryH][newAryW] = "#";
					newAryW++;
					// System.out.println(Arrays.deepToString(newAry));
				} else if ( ary[i][j] == '?' ) {
				} else {
					if ( ary[i-1][j-1] == '#' )
						ctr++;
					if (ary[i-1][j] == '#' )
						ctr++;
					if (ary[i-1][j+1] == '#' )
						ctr++;
					if (ary[i][j-1] == '#' )
						ctr++;
					if (ary[i][j+1] == '#' )
						ctr++;
					if (ary[i+1][j-1] == '#' )
						ctr++;
					if (ary[i+1][j] == '#' )
						ctr++;
					if (ary[i+1][j+1] == '#' )
						ctr++;
					
					// System.out.println("h: "+newAryH);
					// System.out.println("w: "+newAryW);
					// System.out.println(ctr);
					newAry[newAryH][newAryW] = Integer.toString(ctr);
					// System.out.println(Arrays.deepToString(newAry));
					ctr = 0;
					newAryW++;
				}
			}
			newAryW = 0;
			if ( i != 0 )
				newAryH++;
		}
		
		String fin = "";
		for ( int i = 0; i < h; i++ ) {
			for ( int j = 0; j < w; j++ ) {
				if ( newAry[i][j] != "#" )
					fin += Integer.parseInt(newAry[i][j]);
				else
					fin += newAry[i][j];
			}
			fin += "\n";
		}
		
		System.out.println(fin);
	}
}