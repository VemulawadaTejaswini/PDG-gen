import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		if(p>q){
			if(p>r) System.out.println(q+r);
			else System.out.println(p+q);
		}else{
			if(q>r) System.out.println(p+r);
			else System.out.println(p+q);
		}
	}
}
				
