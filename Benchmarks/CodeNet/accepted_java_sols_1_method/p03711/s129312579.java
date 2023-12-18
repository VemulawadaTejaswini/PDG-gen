import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		Integer A[]= {1,3,5,7,8,10,12};
		Integer B[]= {4,6,9,11};
		Integer C[]= {2};
		if(Arrays.asList(A).contains(x)){
			if(Arrays.asList(A).contains(y)){
				System.out.println("Yes");
			}
		}
		if(Arrays.asList(B).contains(x)){
			if(Arrays.asList(B).contains(y)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
		if(x == 2 || y == 2){
			System.out.println("No");
		}
	}
}
