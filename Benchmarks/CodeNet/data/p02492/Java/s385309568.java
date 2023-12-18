import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        while (true){
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            Scanner kb=new Scanner(s);
            int a[]=new int[2];
            int i=0;
            String op="";
            while (kb.hasNext()){
                if (kb.hasNextInt()==false){
                    op=kb.next();
                }
                a[i]=kb.nextInt();
                i++;
            }
            if (op.equals("?")){
                break;
            }
        }
    }
}