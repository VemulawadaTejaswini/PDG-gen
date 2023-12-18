import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s=sc.nextLine();
		long k=sc.nextLong();
		char c[]=s.toCharArray();
		int one=0;
		char ans='a';
		for(int i=0;i<s.length();i++){
			if(c[i]=='1'){
				one++;
			}else{
				ans=c[i];
				break;}
		}
		if(one>=k){
			System.out.println(1);
		}else{
			System.out.println(ans);
		}

	}}