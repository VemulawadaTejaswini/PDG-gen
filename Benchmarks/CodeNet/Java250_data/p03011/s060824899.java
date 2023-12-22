import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int p=sc.nextInt();
		int q = sc.nextInt();
		int r=sc.nextInt();
		int ans=400;
		if(p+q<p+r){
			ans=p+q;
		}else{
			ans=p+r;
		}
		if(r+q<ans){
			ans=r+q;
		}
		System.out.println(ans);
	}
}
