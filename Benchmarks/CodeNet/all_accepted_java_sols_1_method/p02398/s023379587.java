import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int H = 0;
		for(int t =1;t<=c;t++){
			if(c % t ==0){
				if(a<=t){
					if(b>=t){
					H++;
					}
				}
			}
		}
		System.out.println(H);
	}
}