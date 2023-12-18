import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int sum = sc.nextInt();
			if(n == 0 && sum == 0){break;}
			
			int ret = 0;
			int s = 0;
			for(int i = 0; i < (1<<10);i++){
				s = 0;
				if(numofbits5(i) != n){
					continue;
				}
				for(int j =0;j < 10;j++){
					if(((1 << j) & i) != 0){s += j;}
				}
				if(sum == s){ret++;}
			}
			
			System.out.println(ret);
		}
	}
	
	static int numofbits5(int bits) {
		  bits = (bits & 0x55555555) + (bits >> 1 & 0x55555555);
		  bits = (bits & 0x33333333) + (bits >> 2 & 0x33333333);
		  bits = (bits & 0x0f0f0f0f) + (bits >> 4 & 0x0f0f0f0f);
		  bits = (bits & 0x00ff00ff) + (bits >> 8 & 0x00ff00ff);
		  return (bits & 0x0000ffff) + (bits >>16 & 0x0000ffff);
	}
}