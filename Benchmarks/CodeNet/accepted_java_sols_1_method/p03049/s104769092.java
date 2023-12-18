import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans=0;
		int a=0;
		int b=0;
		int count=0;
		for(int i = 0; i<n; i++){
			boolean bb=false;
			boolean aa=false;
			String s = sc.next();
			for(int j=0; j<s.length(); j++){
				if(j==0){
					if(s.charAt(j)=='B'){
						b++;
						bb=true;
					}
				}
				if(j==s.length()-1){
					if(s.charAt(j)=='A'){
						a++;
						aa=true;
					}
					if(aa && bb){
						count++;
					}
					break;
				}
				if(s.charAt(j)=='A' && s.charAt(j+1)=='B'){
					ans++;
				}
			}
		}
		if(count==a && count==b && a>0){
			System.out.println(a-1+ans);
		}else{
		 	System.out.println(ans+Math.min(a,b));
		}
	}
}
