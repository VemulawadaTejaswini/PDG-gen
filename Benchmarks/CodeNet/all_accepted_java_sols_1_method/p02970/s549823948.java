import java.util.*;
public class Main{
    public static void main(String sp[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int d = sc.nextInt();
		int val = (2*d)+1;
		int div = n/val;
		int mod = n%val;
		if(mod>0)
			div+=1;
		System.out.println(div);
	}
}