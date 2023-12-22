import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int H = scan.nextInt();
			int W = scan.nextInt();
			if(H == 0 && W == 0){
				break;
			}else{
				String str = "";
				for(int i = 1; i <= W + 1; i++){
					if(i % 2 == 1){
						str += "#";
					}else{
						str += ".";
					}
				}
				String odd_str = str.substring(0, str.length() - 1);
				String even_str = str.substring(1);
				for(int i = 1; i <= H; i++){
					if(i % 2 == 1){
						System.out.println(odd_str);
					}else{
						System.out.println(even_str);
					}
				}
				System.out.println();
			}
		}
	}
}