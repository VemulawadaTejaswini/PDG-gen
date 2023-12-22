import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		boolean winSecond = true;
		for(int i=0; i<N; i++)
			if(sc.nextInt()%2==1)
				winSecond = false;
		
		System.out.println(winSecond ? "second":"first");
		sc.close();
	}
	
}
