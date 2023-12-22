import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		for(int i = 1;i<=n;i++){
//	 		String input1 = bf.readLine().trim();
//	 		String input2 = bf.readLine().trim();
 			int count = 0;
	 		for(int xy = 1;xy*xy <= 2*i;xy++){
	 			for(int yz = 1;yz*yz <= 2*i-xy*xy;yz++){
	 				int xz2 = 2*i-xy*xy-yz*yz;
	 				int xz = (int)(Math.sqrt(xz2));
	 				if (xz2 >= 1 && Math.sqrt(xz2) == (int)(Math.sqrt(xz2)))
	 					if ((xy+yz+xz)%2 == 0 && (xy+yz+xz)/2 > xy && (xy+yz+xz)/2 > xz && (xy+yz+xz)/2 > yz)
	 						count++;
	 				
	 			}
	 		}
	 		out.println(count);
 		}
 		
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


