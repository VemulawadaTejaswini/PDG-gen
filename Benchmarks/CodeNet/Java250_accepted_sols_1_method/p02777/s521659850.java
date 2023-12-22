

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sin=new Scanner(System.in);
	    String s1=sin.next();
	    String s2=sin.next();
	    int a1=sin.nextInt();
	    int a2=sin.nextInt();
	    String s3=sin.next();
	    if(s1.equals(s3)){
            System.out.println((a1-1)+" "+a2);
        }
	    else System.out.println(a1+" "+(a2-1));
    }
}
