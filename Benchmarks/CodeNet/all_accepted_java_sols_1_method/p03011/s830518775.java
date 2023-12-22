import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
        int max = p;
		if(max < q) max = q;
        if(max < r) max = r;
		System.out.println(p+q+r-max);
	}
}