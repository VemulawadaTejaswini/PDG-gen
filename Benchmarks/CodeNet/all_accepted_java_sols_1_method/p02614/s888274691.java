import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int h = Integer.parseInt(st.nextToken());
 		int w = Integer.parseInt(st.nextToken());
 		int k = Integer.parseInt(st.nextToken());
 		char[][] array = new char[h][w];
 		int black = 0;
 		for(int i = 0;i<h;i++){
 			String a = bf.readLine().trim();
 			for(int j = 0;j<w;j++){
 				array[i][j] = a.charAt(j);
 				if (array[i][j] == '#')
 					black++;
 			}
 		}
 		int count = 0;
 		for(int i = 0;i<(int)(Math.pow(2, h));i++){
 			for(int j = 0;j<(int)(Math.pow(2, w));j++){
 	 			String a = Integer.toBinaryString(i);
 	 			String b = Integer.toBinaryString(j);
 	 			int blackhere = 0;
 	 			for(int ks=0;ks<a.length();ks++){ 	 		
 	 				if (a.charAt(a.length()-1-ks) == '1'){
 	 					for(int ky = 0;ky<w;ky++){
 	 						if (array[h-1-ks][ky] == '#')
 	 							blackhere++;
 	 					}
 	 				}
 	 			}
 	 			for(int ks=0;ks<b.length();ks++){ 	 		
 	 				if (b.charAt(b.length()-1-ks) == '1'){
 	 					for(int ky = 0;ky<h;ky++){
 	 						if (array[ky][w-1-ks] == '#')
 	 							blackhere++;
 	 					}
 	 				}
 	 			}
 	 			
 	 			for(int ks =0;ks<a.length();ks++){
 	 				for(int ky = 0;ky<b.length();ky++){
 	 					if (a.charAt(a.length()-1-ks) == '1' && b.charAt(b.length()-1-ky) == '1' && array[h-1-ks][w-1-ky] == '#')
 	 						blackhere--;
 	 				}
 	 			}
 	 			if (black - blackhere == k){
 	 				count++;
 	 			}
 			}
 		}
 		
 		
 		out.println(count);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


