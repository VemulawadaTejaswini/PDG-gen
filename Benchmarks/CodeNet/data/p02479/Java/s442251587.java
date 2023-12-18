import java.util.Scanner;
import java.io.*;

public class Main{

	public static void main(String[] args) {
		try{
			Scanner scan = new Scanner(System.in);
			String str=scan.next();
			double r=Double.parseDouble(str);
			double P=Math.PI;
			System.out.print(r*r*P);
			System.out.print(" ");
			System.out.println(2*r*P);
        } catch (NumberFormatException e) {
            System.out.println("nono");
        }
	}

}