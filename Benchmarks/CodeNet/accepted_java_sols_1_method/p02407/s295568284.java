import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main (String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int a = Integer.parseInt(sc.nextLine());
        String x =sc.nextLine();
        String[] i =x.split(" ");
        String str = i[a-1];
        int b = a-2;
        for (int c=1;c<a;c++){
        	str=str+" "+i[b] ;
        	b = b-1;
        }
        System.out.println(str);
        }


    }