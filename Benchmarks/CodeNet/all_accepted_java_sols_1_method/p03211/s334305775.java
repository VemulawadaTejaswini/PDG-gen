import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int ans=99999999;
		String s = sc.nextLine();
for(int i=0;i<=s.length()-3;i++){
	int x=Integer.parseInt(s.substring(i,i+3));

if(Math.abs(753-x)<ans){
	ans=Math.abs(753-x);
}
}
System.out.println(ans);
	}
}