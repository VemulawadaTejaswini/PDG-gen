
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = strToIntArray(sc.nextLine(), " ");
        String[] str = new String[num[0]];

        for(int i = 0; i < num[0]; i++) {
        	str[i] = sc.nextLine();
        }
        Arrays.sort(str);
        for(String s : str) {
        	System.out.print(s);
        }
    }

    static char[] strToCharArray(String str) {
    	char[] chAr = new char[str.length()];
    	chAr = str.toCharArray();
    	return chAr;
    }

    static String[] strToArray(String str, String delim) {
    	String[] strAr= new String[str.length()];
    	strAr = str.split(delim);
    	return strAr;
    }

    static int[] strToIntArray(String str, String delim) {
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