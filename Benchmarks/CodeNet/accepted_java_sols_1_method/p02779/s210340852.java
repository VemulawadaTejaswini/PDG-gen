import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> c = new HashSet<>();
		for(int i=0;i<n;i++){
			c.add(sc.nextInt());
		}
		sc.close();
		if(n==c.size()){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}