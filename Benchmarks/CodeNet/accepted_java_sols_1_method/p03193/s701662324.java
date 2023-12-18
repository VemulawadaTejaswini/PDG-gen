import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int h = Integer.parseInt(scan.next());
		int w = Integer.parseInt(scan.next());
		
		int count = 0;
		for(int i = 0;i < n; ++i){
			int a = Integer.parseInt(scan.next());
			int b = Integer.parseInt(scan.next());
			if(a >= h && b >= w) ++count;

		}
		System.out.print(count);

	}
}

