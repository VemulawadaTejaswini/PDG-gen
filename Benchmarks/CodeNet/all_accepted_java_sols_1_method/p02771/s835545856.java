import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if((a==b&&a!=c)||(b==c&&b!=a)||(c==a&&c!=b)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}