import java.io.IOException;
import java.util.Scanner;
public class Main{
	public static void main(String[] args)throws IOException{
		Scanner scan = null;
		int price;
		try{
			scan = new Scanner(System.in);
			price = scan.nextInt();
			int s;
			while((s = scan.nextInt()) !=0)
				price -=s;
		}finally{
			if(scan !=null)scan.close();
		}
		System.out.println(price);
	}
}