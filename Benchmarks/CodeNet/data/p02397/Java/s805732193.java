import static java.lang.String.*;

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan =new Scanner(System.in);
			int a ,b;
			while(true){
				a = scan.nextInt();
				b = scan.nextInt();
				if(a == 0 && b==0)break;
				if(a < b){
					System.out.println(a +" "+b);
				}else
					System.out.println(b +" "+a);
			}
			}finally{
			if(scan !=null)scan.close();
		}

	}
}