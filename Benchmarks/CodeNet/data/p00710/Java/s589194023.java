import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n==0&&r==0){
                break;
            }
            char[] s_char = new char [n];
            for(int i=0;i<n;i++){
                s_char[i] ='0';
                s_char[i]+=i+1;
            }
            String s = String.valueOf(s_char);
            for(int i=0;i<r;i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                String s1 = s.substring(0,p-1);
                String s2 = s.substring(p-1,p-1+c);
                String s3 = s.substring(p-1+c,s.length());
                s = s2+s1+s3;
                //System.out.println(s);
            }
            //System.out.println(s);
            System.out.println(n+1-(s.charAt(0)-'0'));
        }
        sc.close();
    }
}

