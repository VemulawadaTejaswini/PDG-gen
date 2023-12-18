import java.util.Scanner;

public class Main{
	
	public static Boolean networked(int start, int end, int[][] r) {
		Boolean path = false;
		for(int i = 0; i < r.length; i++) {
			if(r[i][0] == start) {
				if(r[i][1] == end) {
					path = true;
					return path;
				} else return networked(r[i][1], end, r);
			}
		}
		return path;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int verts = in.nextInt();
		int relations = in.nextInt();
		int[][] rel_array = new int[relations][2];
		for(int i = 0; i < relations; i++) {
			rel_array[i][0] = in.nextInt();
			rel_array[i][1] = in.nextInt();
		}
		int limit = in.nextInt();
		for(int i = 0; i < limit; i++) {
			if(networked(in.nextInt(), in.nextInt(), rel_array) == true)
				System.out.println("yes");
			else System.out.println("no");
		}
		in.close();
	}

}

