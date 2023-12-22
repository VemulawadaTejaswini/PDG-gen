import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			long a = in.nextLong();
			long b = in.nextLong();
			int k = 2;
			long lcm = 1;
			while(k < a || k < b){
				while(a%k == 0 && b%k == 0){
					a = a/k;
					b = b/k;
					lcm = lcm*k;
				}
				k++;
			}
			System.out.println(lcm+" "+(lcm*a*b));
		}
	}
}