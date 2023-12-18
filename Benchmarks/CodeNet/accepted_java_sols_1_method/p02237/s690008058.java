import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = Integer.parseInt(s.nextLine());
		int[][] list = new int[cnt][cnt];
		for(int i=0 ; i<cnt ; i++) {
			String[] tmp = s.nextLine().split(" ");
			for(int j=0 ; j<Integer.parseInt(tmp[1]) ; j++) {
				list[Integer.parseInt(tmp[0])-1][Integer.parseInt(tmp[j+2])-1] = 1;
			}
		}

		for(int i=0 ; i<list.length ; i++) {
			StringBuilder sb = new StringBuilder();
			for(int j=0 ; j<list[i].length ; j++) {
				if(list[i][j]==0)
					sb.append("0 ");
				else
					sb.append("1 ");
			}
			System.out.println(sb.toString().trim());
		}
	}

}