import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		List<Integer> sales=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
		if(a==0) {
		int	 x=sc.nextInt();
		sales.add(x);
		}
		if(a==1) {
			int y=sc.nextInt();
			System.out.println(sales.get(y));
		}
		if(a==2) {
			sales.remove(sales.size()-1);
		}	
		}
	}
}

