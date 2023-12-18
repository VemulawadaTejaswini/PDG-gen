import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while(sc.hasNext()){
			long a = sc.nextLong();
			long a1 = a;
			long b = sc.nextLong();
			long b1 = b;
			long i;
			if(a <= b){
				for(i = a; i > 0; i--){
					if(a % i == 0 && b % i == 0){
						break;
					}
				}
			}
			else{
				for(i = b; i > 0; i--){
					if(a % i == 0 && b % i == 0){
						break;
					}
				}
			}
			while (a1 != b1) {
				if(a1 <= b1) {
					a1 += a;
				}
				if(b1 <= a1){
					b1 += b;
				}
			}
			System.out.println(i + " " + b1 );
		}
	}

}