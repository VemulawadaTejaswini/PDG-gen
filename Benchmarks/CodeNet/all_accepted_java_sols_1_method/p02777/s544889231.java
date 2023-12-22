
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
static Scanner sc = new Scanner(System.in);
static ArrayList<String> strList = new ArrayList<String>();
static ArrayList<String> intList2 = new ArrayList<String>();
public static void main(String[] args) {

        String str = sc.nextLine();
        String[] strArray = str.split(" ");

        String str0 = strArray[0];
        String str1 = strArray[1];

        String strNum = sc.nextLine();
        String[] intArray = strNum.split(" ");

        int num1 = Integer.parseInt(intArray[0]);
        int num2 = Integer.parseInt(intArray[1]);

        String strans = sc.nextLine();

        if(strans.equals(str0)) {
        	System.out.print(num1-1 + " ");
        	System.out.print(num2);
        }
        else {
        	System.out.print(num1 + " ");
        	System.out.print(num2 - 1);
        }


	}

}
