import java.io.IOException;
import java.util.Scanner;
public class Main{
	public static void main(String[] args)throws IOException{
		Scanner scan = null;
		int price;
		try{
			scan = new Scanner(System.in);
			price = scan.nextInt();
			for(int i = 0; i < 9;i++)
				price -= scan.nextInt();
		}finally{
			if(scan !=null)scan.close();
		}
		System.out.println(price);
	}
}