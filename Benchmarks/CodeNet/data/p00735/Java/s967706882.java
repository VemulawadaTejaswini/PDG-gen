//2019.03.02
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		ArrayList<Integer> array;
		ArrayList<Integer> ans;
		while(x!=1) {
			System.out.print(x+": ");
			int a, b;
			array = new ArrayList<>();
			ans = new ArrayList<>();
			if(x%6==0)System.out.print(6+" ");
			for(int i=6;i<=x;i+=6) array.add(i);
			for(int i=7;i<=x;i+=7) {
				a = i+1;
				b = i+6;
				if(x%a==0 && !array.contains(a)) {
					for(int j=a;j<=x;j+=a) {
						array.add(j);
					}
					ans.add(a);
				}
				if(x%b==0 && !array.contains(b)) {
					for(int j=b;j<=x;j+=b) {
						array.add(j);
					}
					ans.add(b);
				}
			}
			for(int i=0;i<ans.size()-1;i++) {
				System.out.print(ans.get(i)+" ");
			}
			System.out.println(ans.get(ans.size()-1));
			x = sc.nextInt();
		}
	}
}

