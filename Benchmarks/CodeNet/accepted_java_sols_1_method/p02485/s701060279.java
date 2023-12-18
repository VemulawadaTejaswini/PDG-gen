import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (true){
            String s=sc.nextLine();
            int n=s.length();
            int tot=0;
            if (s.equals("0")) break;
            for (int i=0;i<n;i++){
                tot+=((int)s.charAt(i)-'0');
            }
            System.out.println(tot);
        }
    }
}