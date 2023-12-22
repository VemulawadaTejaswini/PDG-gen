import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();

        for(int i = x - (k - 1); i <= x + (k - 1); i++) {
        	System.out.print(i);
        	if(i != x + (k -1)) System.out.print(" ");
        	
        }


    }

    static char[] toCharArray(String str) {
    	char[] chAr = new char[str.length()];
    	chAr = str.toCharArray();
    	return chAr;
    }

    static String[] toStringArray(String str, String delim) {
    	String[] stAr = str.split(delim);
    	return stAr;
    }

    static int[] toIntArray(String str, String delim) {
    	String[] strAr = str.split(delim);
    	int[] intAr = new int[strAr.length];
    	for(int i = 0; i < strAr.length; i++) {
    		intAr[i] = Integer.parseInt(strAr[i]);
    	}
    	return intAr;
    }

    static int toInt(String str) {
    	int num = Integer.parseInt(str);
    	return num;
    }
}