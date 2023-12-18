import java.util.ArrayList;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		long N = scan.nextInt();
		ArrayList<String> namebox = new ArrayList<String>();	
		long[] judge = new long[5];
		for(int i= 0;i < N;i++){
			String x = scan.next();
			namebox.add(x);
			if(x.charAt(0) == 'M'){
				judge[0]++;
			}else if(x.charAt(0) == 'A'){
				judge[1]++;
			}else if(x.charAt(0) == 'R'){
				judge[2]++;
			}else if(x.charAt(0) == 'C'){
				judge[3]++;
			}else if(x.charAt(0) == 'H'){
				judge[4]++;
			}
		}
		
		long ans = (judge[0]*judge[1]*judge[2]) +  (judge[0]*judge[1]*judge[3]) +  (judge[0]*judge[1]*judge[4]) +  (judge[0]*judge[2]*judge[3]) 
				+  (judge[0]*judge[2]*judge[4]) +  (judge[0]*judge[3]*judge[4]) +  (judge[1]*judge[2]*judge[3]) +  (judge[1]*judge[2]*judge[4])
				+  (judge[1]*judge[3]*judge[4]) +  (judge[2]*judge[3]*judge[4]) ;
		
		System.out.println(ans);

	}






}
