import static java.lang.System.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n[] = new int[4];
		for(int i = 0;i < 3; i++){
			n[i] = sc.nextInt();
		}
		n[3] = n[2] - (n[0] - n[1]);
		out.println((0 < n[3])? n[3]:0);
	}
}
