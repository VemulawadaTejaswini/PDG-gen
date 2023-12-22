import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int ans=1;
		int c=0;
		for(int i=0; i<n; i++){
			int l=sc.nextInt();
			if(c+l<=x){
				ans++;
				c+=l;
			}else{
				break;
			}
		}
		System.out.println(ans);
	}
}
