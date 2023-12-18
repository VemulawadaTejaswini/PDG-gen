import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = 2;
			int n = sc.nextInt();
				for(int i=1; i<n; i++){
					a = a +  i + 1;
				}
				
				System.out.println(a);
		}

	}

}