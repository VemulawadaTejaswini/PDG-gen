import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();

        for(int i=0;i<c.length;i++) {
            if (c[i] > 'Z' - n){
                c[i]=(char) (c[i]-('Z'-'A')+n-1);
            }else {
                c[i]=(char)(c[i]+n);
            }

        }
        s = new String(c);
        System.out.println(s);


    }
}
