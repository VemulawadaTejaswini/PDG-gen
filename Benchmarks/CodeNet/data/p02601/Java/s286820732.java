import java.util.*;

public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int k = sc.nextInt();
	boolean isCan = false;
	for (int i=0; i<=k; i++) {
	    if (a<b*(int)Math.pow(2,i) && b*(int)Math.pow(2,i)<c*(int)Math.pow(2,k-i))
		isCan = true;
	}
	if (isCan) System.out.print("Yes");
	else { System.out.print("No"); }
    }
}
