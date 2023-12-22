import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next(),t=sc.next();
        for(int i=0;i<n;i++){
            System.out.printf("%c%c",s.charAt(i),t.charAt(i));
        }
        System.out.println();
    }
}