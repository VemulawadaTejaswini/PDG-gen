import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int e[] = new int[4];
		
		int sameLength = 0;
		
		for(int i = 0 ; i < 4 ; i++) {
			e[i] = scan.nextInt();
			for(int j = 0 ; j < i ; j++) {
				if(e[i] == e[j]) {
					++sameLength;
					e[i] = -1;
					e[j] = -1;
					break;
				}
			}
		}
		if(sameLength == 2) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}

