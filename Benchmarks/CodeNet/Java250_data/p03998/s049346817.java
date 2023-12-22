import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        String a = in.next();
        String b = in.next();
        String c = in.next();
        int i = a.length();
        int j = b.length();
        int k = c.length();
        int i1=-1;int i2=-1;int i3 =-1;
        int next = 0;
        while (true){
            if (next==0){
                i1++;
                if(i1==i){
                    System.out.println("A");
                    break;
                }
                else {
                    if (a.charAt(i1)=='a'){
                        next=0;
                    }
                    else if (a.charAt(i1)=='b'){
                        next=1;
                    }
                    else {
                        next=2;
                    }
                }
            }
            else if (next==1){
                i2++;
                if(i2==j){
                    System.out.println("B");
                    break;
                }
                else {
                    if (b.charAt(i2)=='a'){
                        next=0;
                    }
                    else if (b.charAt(i2)=='b'){
                        next=1;
                    }
                    else {
                        next=2;
                    }
                }
            }
            else {
                i3++;
                if(i3==k){
                    System.out.println("C");
                    break;
                }
                else {
                    if (c.charAt(i3)=='a'){
                        next=0;
                    }
                    else if (c.charAt(i3)=='b'){
                        next=1;
                    }
                    else {
                        next=2;
                    }
                }
            }
            
        }
    }
}
