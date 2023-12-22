import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		char[]a=s.toCharArray();
		//int size=s.length();
		
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				if(a[i]=='L') {
					System.out.println("No");
					 return;
				}
			}else {
				if(a[i]=='R') {
					System.out.println("No");
					 return; 
				}
			}
		}
		System.out.println("Yes");
		 return; 
	}

}