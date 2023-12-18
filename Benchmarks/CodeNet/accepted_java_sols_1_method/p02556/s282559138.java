import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		long[][] coords = new long[n][2];
 		for(int j = 0;j<n;j++){
 			StringTokenizer st = new StringTokenizer(bf.readLine());
 			coords[j][0] = Integer.parseInt(st.nextToken());
 			coords[j][1] = Integer.parseInt(st.nextToken());
 		}
 		int i1 = 0;
 		long m1 = 0;
 		for(int j = 0;j<n;j++){
 			if (coords[j][0] + coords[j][1] > m1){
 				m1 = coords[j][0] + coords[j][1];
 				i1 = j;
 			}
 		}
 		
 		
 		int i2 = 0;
 		long m2 = 0;
 		for(int j = 0;j<n;j++){
 			if (-coords[j][0] + coords[j][1] > m2){
 				m2 = -coords[j][0] + coords[j][1];
 				i2 = j;
 			}
 		}
 		
 		int i3 = 0;
 		long m3 = 0;
 		for(int j = 0;j<n;j++){
 			if (coords[j][0]  -coords[j][1] > m3){
 				m3 = coords[j][0] - coords[j][1];
 				i3 = j;
 			}
 		}
 		
 		int i4 = 0;
 		long m4 = 0;
 		for(int j = 0;j<n;j++){
 			if (-coords[j][0] - coords[j][1] > m4){
 				m4 = -coords[j][0] - coords[j][1];
 				i4 = j;
 			}
 		}
	 	long amax = 0;
 		for(int j = 0 ;j<n;j++){
 			if ((long)(Math.abs(coords[j][0] - coords[i1][0])) + (long)(Math.abs(coords[j][1] - coords[i1][1])) > amax){
 				amax = (long)(Math.abs(coords[j][0] - coords[i1][0])) + (long)(Math.abs(coords[j][1] - coords[i1][1])) ;
 			}
 			if ((long)(Math.abs(coords[j][0] - coords[i2][0])) + (long)(Math.abs(coords[j][1] - coords[i2][1])) > amax){
 				amax = (long)(Math.abs(coords[j][0] - coords[i2][0])) + (long)(Math.abs(coords[j][1] - coords[i2][1])) ;
 			}
 			if ((long)(Math.abs(coords[j][0] - coords[i3][0])) + (long)(Math.abs(coords[j][1] - coords[i3][1])) > amax){
 				amax = (long)(Math.abs(coords[j][0] - coords[i3][0])) + (long)(Math.abs(coords[j][1] - coords[i3][1])) ;
 			}
 			if ((long)(Math.abs(coords[j][0] - coords[i4][0])) + (long)(Math.abs(coords[j][1] - coords[i4][1])) > amax){
 				amax = (long)(Math.abs(coords[j][0] - coords[i4][0])) + (long)(Math.abs(coords[j][1] - coords[i4][1])) ;
 			}
 		}
 		
 		out.println(amax);
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


