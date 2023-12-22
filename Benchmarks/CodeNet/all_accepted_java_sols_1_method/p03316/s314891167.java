import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;
        int check=0;
        String A=sc.next();
        String[] B=new String[A.length()];
        int c=0;
        for(int i=0;i<A.length();i++) {
        		c+=Integer.parseInt(A.substring(i, i+1));
        }
        if(Integer.parseInt(A)%c==0) {System.out.println("Yes");}
        else {System.out.println("No");}

	}

}
