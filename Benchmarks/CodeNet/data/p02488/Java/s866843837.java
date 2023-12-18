import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[10];
        for (int i=0;i<n;i++){
            for (int j=i;j<n-1;j++){
                if (s[n].compareTo(s[n+1])<0){
                    String boo=s[n];
                    s[n]=s[n+1];
                    s[n+1]=boo;
                }
            }
        }
        System.out.println(s[n-1]);
    }
}