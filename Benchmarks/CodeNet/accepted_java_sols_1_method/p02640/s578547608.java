import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int X = sc.nextInt();
	int Y = sc.nextInt();
	boolean result = false;
	for (int i=0;i<=X;i++) {
	    if (i * 2 + (X-i) * 4 == Y) {
		result = true;
		break;
	    }
	}
	if (result) System.out.print("Yes");
	else System.out.print("No");
    }
}
