import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long re = 1;
		int n = in.nextInt();
		for(int i=0; i< n; i++){
			re *= in.nextLong();
			if(re>Math.pow(10, 18)){
				System.out.println(-1);
			    return;
			}
		}
		System.out.println(re);

	}
}
