import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		int n = sc.nextInt();
		int k = sc.nextInt();
		for(int i = 0; i < k; i++) {
			int a = sc.nextInt();
			for(int j = 0; j <a;j++) {
				set.add(sc.nextInt());
			}
		}
		System.out.println(n-set.size());
	}
}