import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        long a=sc.nextLong();
        String m="";
        while(a>0){
            m=(char)((a%26-1+'a'))+""+m;
            a/=26;
        }
        System.out.println(m);
    }
}
