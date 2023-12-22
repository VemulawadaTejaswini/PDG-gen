import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int H = 0;
		for(int a=1;a>0;a++){
			H = scan.nextInt();
			if(H != 0){
				System.out.println("Case "+a+": "+H);
			}else{
				break;
			}
		}
	}
}