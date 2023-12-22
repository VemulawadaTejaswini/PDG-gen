import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			int m = stdIn.nextInt();
			int f = stdIn.nextInt();
			int r = stdIn.nextInt();
			if((m+f+r) == -3){
				break;
			}else if(m==-1 || f ==-1){
				System.out.println("F");
			}else if((m+f) >= 80){
				System.out.println("A");
			}else if((m+f) >= 65){
				System.out.println("B");
			}else if((m+f) >= 50){
				System.out.println("C");
			}else if((m+f) >= 30){
				if (r >= 50) {
					System.out.println("C");
				}else{
					System.out.println("D");
				}
			}else{
				System.out.println("F");
			}

		}
	}
}