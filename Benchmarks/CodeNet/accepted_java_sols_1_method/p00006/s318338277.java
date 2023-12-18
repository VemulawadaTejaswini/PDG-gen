import java.util.Scanner;

public class Main {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
	    String str = sc.nextLine();
	    char[] strArray = str.toCharArray();
	    int a = strArray.length;
        for(i = a - 1; i >= 0; i--) {
        	System.out.print(strArray[i]);
        }
        System.out.println();
        sc.close();
    }
}
