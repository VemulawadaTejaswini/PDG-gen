import java.util.*;
public class Main {

	static int a,b,total;

	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		total=0;

		push();
		push();

		System.out.println(total);
	}

	public static void push() {
		if(a>=b) {
			total+=a;
			a--;
		}else {
			total+=b;
			b--;
		}
	}
}