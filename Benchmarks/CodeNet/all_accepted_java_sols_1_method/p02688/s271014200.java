import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int k = Integer.parseInt(scan.next());
		int[] sunuke = new int[n];
		for(int i = 0;i < k; ++i){
			int d = Integer.parseInt(scan.next());
			for(int j = 0;j < d; ++j){
				sunuke[Integer.parseInt(scan.next())-1]++;
			}
		}
		int count = 0;
		for(int i :sunuke){
			if(i == 0)count++;
		}
		System.out.print(count);
	}
}

