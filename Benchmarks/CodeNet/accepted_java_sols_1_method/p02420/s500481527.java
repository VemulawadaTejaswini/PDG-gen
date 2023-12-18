import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int[] n;
    public static int m;
    public static String s;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        s=sc.next();
        if(s.equals("-")){
            sc.close();
            return;
        }
        m=sc.nextInt();
        n=new int[m];
        for(int i=0;i<m;i++){
            int len=s.length();
            n[i]=sc.nextInt();
            String a=s.substring(0,n[i]);
            String b=s.substring(n[i],len);
            s=b+a;
        }
        System.out.println(s);
    }
}
}
