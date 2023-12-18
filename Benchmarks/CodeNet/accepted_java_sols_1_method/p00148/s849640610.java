import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
 		while(true){
			try{
				int ame = in.nextInt();
				if(ame >= 39 && ame % 39 == 0){
					System.out.println("3C39");
				}else{
					int num = ame % 39;
					if(num < 10){
						System.out.println("3C0" + num);
					}else{
						System.out.println("3C" + num);
					}
				}
			}catch(Exception e){
				System.exit(0);
			}
		}
	}
}