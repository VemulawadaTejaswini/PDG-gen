import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int ans=0;
		for(int i=1; x>0; i++){
			x-=i;
			ans++;
		}
		System.out.println(ans);
	}
}
