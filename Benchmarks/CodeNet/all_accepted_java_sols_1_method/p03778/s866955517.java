import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt(),a = scanner.nextInt(),b = scanner.nextInt();
		int dw = 0;
		while(true){
			if(a < b && a + w < b){
				if(a + w + dw == b){
					break;
				}
				dw++;
			}else if(a < b && a + w >= b){
				break;
			}else if(a > b && b + w < a){
				if(b + w + dw == a){
					break;
				}
				dw++;
			}else if(a > b && b + w >= a){
				break;
			}else{
				break;
			}
		}
		System.out.println(dw);
	}

}
