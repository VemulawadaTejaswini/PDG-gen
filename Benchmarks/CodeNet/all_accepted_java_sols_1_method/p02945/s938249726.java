import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner re=new Scanner(System.in);
		int A1=re.nextInt();
		int B1=re.nextInt();
		System.out.println(Math.max(Math.max((A1+B1), (A1-B1)), (A1*B1)));
}
}