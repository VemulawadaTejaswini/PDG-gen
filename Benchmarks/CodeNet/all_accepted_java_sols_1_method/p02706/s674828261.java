import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int m=Integer.parseInt(scan.next());
		int sumA=0;
		for (int i=0;i<m;++i){
			sumA+=Integer.parseInt(scan.next());
		}
		if (sumA>n){
			System.out.print(-1);
		}else{
			System.out.print(n-sumA);
		}




	}
}
//end