import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int keep;
		int n4=0;
		int n2=0;
		for(int i=0;i<n;i++){
			keep=sc.nextInt();
			if(keep%4==0){
				n4++;
			}
			else if(keep%2==0){
				n2++;
			}
		}
		if(n/2<=n4||n2>=n-2*n4){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}