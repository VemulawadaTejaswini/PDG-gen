import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		String s1=sc.next();
		String s2=sc.next();
		long mod=1000000007;
		long ans=1;
		for(int i = 0; i<n;){
			if(s1.charAt(i)==s2.charAt(i)){
				if(i==0){
					ans*=3;
				}else if(s1.charAt(i-1)==s2.charAt(i-1)){
					ans*=2;
				}
				i++;
			}else{
				if(i==0){
					ans*=6;
				}else if(s1.charAt(i-1)==s2.charAt(i-1)){
					ans*=2;
				}else{
					ans*=3;
				}
				i+=2;
			}
			ans%=mod;
		}
		System.out.println(ans);
	}
}
