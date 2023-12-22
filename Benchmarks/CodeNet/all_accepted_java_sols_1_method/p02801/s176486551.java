
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] arg) {
		Scanner ob=new Scanner(System.in);
		char c=ob.next().charAt(0);
		for(char c1='a';c1<='z';c1++){
		if(c==c1){c1++;System.out.println(c1);}
		}
	}
}
