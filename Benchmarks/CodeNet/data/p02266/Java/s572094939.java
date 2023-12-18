import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br;
		if( args.length > 0 && args[0].equals("File") == true ) {
			br = getReader("C:\\Users\\USER\\Downloads\\ALDS1_3_C-in10.txt");
		} else {
			br = getReader();
		}
		String inp = br.readLine();
		Geo g = new Geo(inp);
//		g.showHeight();
		int start = 0;
		int[] pond;
		int area = 0;
		int a = 0;
		List<Integer> list = new ArrayList<Integer>();
		while((pond=g.getPond(start)) != null) {
			a = (int)g.getArea(pond[0], pond[1]);
//			System.out.println( pond[0] + " " + pond[1] + " " + a );
			list.add(a);
			area += a;
			start = pond[1];
		}
		System.out.println(area);
		System.out.print(list.size());
		for( int b : list ) {
			System.out.print(" " + b);
		}
		System.out.println("");
	}
	public static class Geo {
		int[] height;
		public Geo(String inp) throws Exception {
			height = new int[inp.length()+1];
			height[0] = 0;
			int pos = 0;
			int peek = 0;
			for( int i = 0 ; i < inp.length() ; i++ ) {
				switch(inp.charAt(i)) {
				case '\\' :
					height[i+1] = height[i]-1;
					break;
				case '/' :
					height[i+1] = height[i]+1;
					break;
				case '_' :
					height[i+1] = height[i];
					break;
				default:
					throw new Exception();
				}
			}
		}
		public void showHeight() {
			for( int i = 0 ; i < height.length ; i++ ) {
				System.out.print( height[i] + " ");
			}
			System.out.println("");
		}
		public int[] getPond(int start) {
			int peek = height[start];
			int pondStart = start;
			int pondEnd = 0;
			for( int i = start+1 ; i < height.length ; i++ ) {
				if ( peek > height[i] ) {
					int mode = 0;
					int endwk = 0;
					for( int j = i+1 ; j < height.length ; j++ ) {
						if ( peek == height[j] ) {
							pondEnd = j;
							break;
						} else if (height[j-1] < height[j] ) {
							if ( mode == 0 ) {
								mode = 1;
								pondEnd = j;
								endwk = height[j-1];
							}
						}
						if ( mode == 1 && endwk < height[j] ) {
							endwk = height[j];
							pondEnd = j;
						}
					}
					break;
				} else if ( peek < height[i]) {
					peek = height[i];
					pondStart = i;
				} else if ( peek == height[i] ) {
					pondStart = i;
				}
			}
			while( pondStart <= pondEnd ) {
				if ( height[pondStart] == height[pondEnd] ) {
					break;
				}
				pondStart++;
			}
			if ( pondEnd > 0 && pondStart < pondEnd) {
				int[] pond ={pondStart, pondEnd};
				return pond;
			} else {
				return null;
			}
		}
		public double getArea(int start, int end ) {
			double area = 0;
			int top = height[start];
			for( int i = start+1 ; i <= end ; i++ ){
				if ( height[i-1] > height[i] ) {
					area += ( top -height[i-1] + 0.5) ;
				} else if ( height[i-1] < height[i] ) {
					area += ( top - height[i] + 0.5 );
				} else {
					area += ( top - height[i]);
				}
			}
			return area;
		}
	}
	public static BufferedReader getReader() {
		return( new BufferedReader(new InputStreamReader(
				System.in)));
	}
	public static BufferedReader getReader(String path) throws Exception{
		return( new BufferedReader(new InputStreamReader(
				new FileInputStream(path))));
	}

}