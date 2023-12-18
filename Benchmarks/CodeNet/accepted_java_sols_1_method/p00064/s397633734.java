import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\\D+");
		int ans=0;
		while(sc.hasNext()){
			ans+=sc.nextInt();
		}
		System.out.println(ans);
	}
}