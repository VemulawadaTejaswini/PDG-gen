import java.io.IOException;
import java.util.Scanner;


public class Main{
	public static void main(String args[]) throws IOException{
		Scanner bf = new Scanner(System.in);
		int N = Integer.parseInt(bf.nextLine());
		int[] ans = new int[80];
		for(int i=0; i<N; i++){
			for(int j=0; j<80; j++){
				ans[j] = 0;
			}

			String str1 = bf.nextLine();
			int len1 = str1.length();
			for(int k=0; k<len1; k++){
				ans[80-len1+k] = Integer.parseInt(""+str1.charAt(k));
			}
			String str2 = bf.nextLine();
			int len2 = str2.length();
			for(int k=0; k<len2; k++){
				ans[80-len2+k] += Integer.parseInt(""+str2.charAt(k));
			}

			for(int k=79; k>0; k--){
				if(ans[k]>=10){
					ans[k] -= 10;
					ans[k-1]++;
				}
			}
			if(ans[0]>=10) System.out.println("overflow");
			else{
				boolean start = false;
				for(int j=0; j<80; j++){
					if(start) System.out.print(ans[j]);
					else if(ans[j] != 0){
						start = true;
						System.out.print(ans[j]);
					}
				}
				System.out.println();
			}
		}
	}
}