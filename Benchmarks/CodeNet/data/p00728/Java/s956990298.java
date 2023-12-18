
import java.util.Arrays;
import java.util.Scanner;
public class AOJ1159 {
	public static void main(String args[]){
		int n=0,sum=0,ave=0;
		int[] s;
		boolean flag=true;
		Scanner scan = new Scanner(System.in);
		while(flag!=false){
			sum=0;
			ave=0;
			n=scan.nextInt();
			if(n==0){
				flag=false;
				break;
			}
			s = new int[n];
			for(int i = 0;i < n;i++){
				s[i]=scan.nextInt();
			}
			Arrays.sort(s);
			for(int i=1;i<n-1;i++){
				sum+=s[i];
			}
			ave=sum/(n-2);
			System.out.println(ave);
		}
	}
}

