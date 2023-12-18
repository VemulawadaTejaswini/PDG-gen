import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,i;
        char c;
        String str;
        str=scan.nextLine();
        n=str.length();
        for(i=0;i<n;i++) {
        	if(Character.isUpperCase(str.charAt(i))) {
        		System.out.print(Character.toLowerCase(str.charAt(i)));
        	}
        	else if(Character.isLowerCase(str.charAt(i))) {
        		System.out.print(Character.toUpperCase(str.charAt(i)));
        	}
        	else {
        		System.out.print(str.charAt(i));
        	}
        }
        System.out.println("");
    }
}
