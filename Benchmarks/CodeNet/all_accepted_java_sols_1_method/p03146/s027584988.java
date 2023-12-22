import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ans=0;
		int a=scan.nextInt();
		List<Integer> foo = new ArrayList<Integer>();
		foo.add(a);
		for(int i=1;i!=1000000;i++) {
			if(a%2==0) {
				if(foo.indexOf(a/2)!=-1) {
				ans=i;
				break;
		        }
				a=a/2;
			}
				else {
					if(foo.indexOf(a*3+1)!=-1) {
						ans=i;
						break;
			        }
					a=a*3+1;
				}
			foo.add(a);
			}
		System.out.println(ans+1);
	}
}