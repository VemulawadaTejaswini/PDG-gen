import java.util.*;

public class Main{
	static Scanner s=new Scanner(System.in);

	public static void main(String[] $){
		int v=s.nextInt();
		System.out.println(v<1200?"ABC":v<2800?"ARC":"AGC");
	}
}