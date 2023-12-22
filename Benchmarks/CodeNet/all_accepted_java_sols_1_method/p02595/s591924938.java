import java.util.*;
import java.io.*;

public class Main{
	// class node implements Comparator<int[]>{
	// 	public int compare(int[] a, int b){
	// 		double d1 = Math.sqrt(Math.pow(a[0],2)+Math.pow(a[1],2));
	// 		double d2 = Math.sqrt(Math.pow(b[0],2)+Math.pow(b[1],2));
	// 		if(d1>d2){
	// 			return 
	// 		}
	// 	}
	// }
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		//int[][] points = new int[n][2];
		int count = 0;
		for(int i=0;i<n;i++){
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());;
			int y = Integer.parseInt(st.nextToken());;
			double d1 = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
			if(d1>k){

			}
			else{
				count++;
			}
		}
		// Arrays.sort(points, new Comparator<int[]>{
		// 	public int compare()
		// });
		System.out.println(count);
	}
}