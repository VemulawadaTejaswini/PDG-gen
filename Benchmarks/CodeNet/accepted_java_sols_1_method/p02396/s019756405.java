import static java.lang.String.*;

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan =new Scanner(System.in);
			int num;
			for(int i = 1;(num = scan.nextInt())!= 0;i++)
				System.out.println("Case "+valueOf(i)+": "+valueOf(num));
		}finally{
			if(scan !=null)scan.close();
		}

	}
}