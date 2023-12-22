import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	String s=sc.next();
	char c[]=s.toCharArray();
	int ans=0;
	for(int i=0;i<=s.length()-1;i++){
		if(c[i]=='+'){
			ans++;
		}else{
			ans--;
		}
	}
System.out.println(ans);
	}}