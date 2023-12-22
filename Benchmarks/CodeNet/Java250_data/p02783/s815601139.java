import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int h = sc.nextInt();
	int a =sc.nextInt();
	int x = 0;
	int y = 0;
	int z =0;
	if(a>h) {
		x =1;
		System.out.println(x);
	}else if (h%a==0) {
		z=h/a;
		System.out.println(z);
	}else if (h%a!=0) {
		y = h/a +1;
		System.out.println(y);
	}
	sc.close();

	

}
}
