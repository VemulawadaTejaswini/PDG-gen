import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean ans = true;
		String s = sc.next();
		char c[] = s.toCharArray();
if(c[a]!='-'||s.length()!=a+b+1){
	ans=false;
}
for(int i=0;i<=s.length()-1;i++){
	if(i!=a&&c[i]=='-'){
		ans=false;
	}
}
		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}