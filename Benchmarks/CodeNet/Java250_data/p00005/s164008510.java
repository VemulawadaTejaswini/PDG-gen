import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a, b, tmp, a2, b2;
		while(sc.hasNext()){
			a2 = a = sc.nextInt();
			b2 = b = sc.nextInt();
			
			a %= b;
			while(a != 0){
				tmp = a;
				a = b;
				b = tmp;
				a %= b;
			}
			System.out.println(b + " " + a2 / b * b2);
		}
	}
}