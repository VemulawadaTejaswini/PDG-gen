import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i*4<=n;++i) {
			if((n-i*4)%7==0) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}