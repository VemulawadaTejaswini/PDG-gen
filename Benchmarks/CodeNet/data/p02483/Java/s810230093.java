package ????????°???????????°A;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		try{String line1 = scanner.next();
			String line2 = scanner.next();
			String line3 = scanner.next();

			int a =Integer.parseInt(line1);
			int b =Integer.parseInt(line2);
			int c =Integer.parseInt(line3);
			if(a<b){
				if(b<c)
					System.out.println(a+" "+b+" "+c);
				else if(a>c)
					System.out.println(c+" "+a+" "+b);
				else if(c>a)
					System.out.println(a+" "+c+" "+b);
			}
			if(a>b){
				if(b>c)
					System.out.println(c+" "+b+" "+a);
				else if(a>c)
					System.out.println(b+" "+c+" "+a);
				else if(c>a)
					System.out.println(b+" "+a+" "+c);
			}
			scanner.close();

		}
		 	catch (NumberFormatException e) {
			 System.out.println("??°????????¢????????£????????????????????????");
			 }


	}

}