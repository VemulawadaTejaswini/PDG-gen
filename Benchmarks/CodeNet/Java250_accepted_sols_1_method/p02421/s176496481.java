import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=0;
        int h=0;
        for(int i=0;i<n;i++){
            String Taro=sc.next();
            String Hanako=sc.next();
            int result=Taro.compareTo(Hanako);
            if(result>0) t+=3;
            else if(result<0) h+=3;
            else{
                t++;
                h++;
            }
        }
        System.out.println(t+" "+h);
    }
}

