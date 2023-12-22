import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<=5) {
			System.out.println(0);
		}else if(n<=12){
			System.out.println(s.nextInt()/2);
		}else {
			System.out.println(s.nextInt());
		}
	}
}