import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		ArrayList<Integer> listB = new ArrayList<>();
		int count =0;
 
		for(int i=0;i<m;i++){
			listB.add(sc.nextInt());
		}
		for(int i=0;i<n;i++){
			int sum =0;
			for(int j=0;j<m;j++){
				int a = sc.nextInt();
				sum += a * listB.get(j);
			}
			if(sum + c >0){
				count++;
			}

		}


        System.out.println(count);
 
	}
}
