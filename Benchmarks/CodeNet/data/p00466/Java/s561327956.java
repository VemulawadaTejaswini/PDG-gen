import java.io.IOException;
import java.util.Scanner;
public class Main{
	public static void main(String[] args)throws IOException{
		Scanner scan = null;
		int price;
		try{
			scan = new Scanner(System.in);
			while(scan.hasNext()){
				price = scan.nextInt();
				int s;
				while((s = scan.nextInt()) !=0)
					price -=s;
				System.out.println(price);
			}
		}finally{
			if(scan !=null)scan.close();
		}

	}
}