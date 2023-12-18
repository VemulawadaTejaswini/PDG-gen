import java.util.Scanner;

public class  Main{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int i = 1;
		
		while(true) {
			int a = src.nextInt();
			int b = src.nextInt();
       
			if((a == 0) && (b == 0)){
				break;
			}else {
				if(a < b) {
					System.out.println(String.format("%d %d",a ,b));
				}else {
					System.out.println(String.format("%d %d",b ,a));
				}
			}
   		}
	}
}

