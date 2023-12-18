import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int count[]=new int[26];
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        for (int i=0;i<26;i++) count[i]=0;
        Scanner sc=new Scanner(System.in);
        while (true){
        String s=sc.nextLine();
        if (s.equals("")) break;
        Scanner kb=new Scanner(s);
        while (kb.hasNext()){
            String hoge=kb.next();
            for (int i=0;i<hoge.length();i++){
                int n=(int)hoge.charAt(i);
                if (n<97) n+=32;
                if (n>=97&&n<=122) count[n-97]++;
            }
        }
        }
        for (int i=0;i<26;i++){
            System.out.println(alphabet.charAt(i)+" : "+count[i]);
        }
    }
}