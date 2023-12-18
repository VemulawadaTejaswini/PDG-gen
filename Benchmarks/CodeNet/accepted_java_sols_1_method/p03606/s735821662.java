import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int ans=0;
int l,r;
for(int i=1;i<=n;i++){
	l=sc.nextInt();
	r=sc.nextInt();
	ans=ans+r-l+1;
}
System.out.println(ans);

	}}