import java.util.*;
public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int a = sc.nextInt();
			double b = sc.nextDouble();
			int n = sc.nextInt();
			double given = a/b - (int)(a/b);
			int sum = 0;
			for(int i=0; i<n; i++){
				sum += (int)(given*10);
				given = given*10 - (int)(given*10);
			}
			System.out.println(sum);
		}
	}

}