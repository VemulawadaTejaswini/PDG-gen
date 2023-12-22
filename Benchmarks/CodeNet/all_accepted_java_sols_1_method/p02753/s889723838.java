import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        String m=sc.next();
        char[]n=m.toCharArray();
        int p=0;
        int q=0;
        for(int i=0;i<n.length;i++){
            if(n[i]=='A')
                p++;
            else
                q++;
        }
        if(p==3||q==3) 
            System.out.println("No");
        else
            System.out.println("Yes");

    }
}



