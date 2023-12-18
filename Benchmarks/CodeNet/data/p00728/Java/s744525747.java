import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n;

		while(true){
			n=stdIn.nextInt();
			if(n==0) break;
					
			int[] s=new int[n];
			for(int i=0;i<n;i++){
				s[i]=stdIn.nextInt();
			}
			int max = s[0];
			int min = s[0];
			int a=0;
			int b=0;
			for(int i=1;i<s.length;i++){
				if(s[i]>max){
					max = s[i];
					a=i;
				}
				if(s[i]<min){
					min = s[i];
					b=i;
				}
			}
			s[a]=0;
			s[b]=0;
			int all = 0;
			for(int i=0;i<s.length;i++){
				all += s[i];
			}
			int ave = all/(n-2);
			System.out.println(ave);
		}
	}

}