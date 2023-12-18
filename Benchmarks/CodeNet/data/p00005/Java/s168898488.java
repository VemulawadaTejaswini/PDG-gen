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
			if(a > b){
				for(i = a / 2; i > 0; i--){
					if(a % i == 0 && b % i == 0){
						break;
					}
				}
				for(;;){
					a1 += a;
					if(a1 % b == 0){
						break;
					}
				}
				System.out.println(i + " " + a1 );
			}
			else if(a < b){
				for(i = b / 2; i > 0; i--){
					if(a % i == 0 && b % i == 0){
						break;
					}
				}
				for(;;){
					b1 += b;
					if(b1 % a == 0){
						break;
					}
				}
				System.out.println(i + " " + b1 );
			}
			else{
				i = b;
				System.out.println(i + " " + b1 );
			}
		}
	}

}