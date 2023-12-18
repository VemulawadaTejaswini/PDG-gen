/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.math.BigInteger; 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        if(a.equals(b)){
            System.out.println("EQUAL");

        }
        else if(a.compareTo(b) < 0){
            System.out.println("LESS");
        }
        else{
            System.out.println("GREATER");
        }

	}
}
