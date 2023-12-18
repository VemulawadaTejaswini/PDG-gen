import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a1, b1, r1, r2, temp, a2, b2;

		while(scan.hasNext()){
			a1 = scan.nextInt();
			a2 = a1;
			b1 = scan.nextInt();
			b2 = b1;
			while(a2 % b2 != 0){
				if(a2 < b2){
					temp = a2;
					a2 = b2;
					b2 = temp;
				}
				a2 = a2 % b2;
			}
			r1 = b2;
			r2 = (a1*b1) / r1;
			System.out.println(r1+" "+r2);
		}
	}

}