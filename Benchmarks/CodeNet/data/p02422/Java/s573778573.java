import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=sc.nextInt();
        int a;
        int b;
        String str2;
        StringBuilder sb;
        for(int i=0;i<n;i++){
            String order=sc.next();
            a=sc.nextInt();
            b=sc.nextInt();
            if(order.equals("print")){
                str2=str.substring(a,b+1);
                System.out.println(str2);
            }else if(order.equals("reverse")){
                str2=str.substring(a,b+1);
                sb=new StringBuilder(str2);
                str2=sb.reverse().toString();
                sb=new StringBuilder(str);
                str=sb.replace(a,b+1,str2).toString();
            }else if(order.equals("replace")){
                str2=sc.next();
                sb=new StringBuilder(str);
                str=sb.replace(a,b+1,str2).toString();
            }
        }
    }
}
