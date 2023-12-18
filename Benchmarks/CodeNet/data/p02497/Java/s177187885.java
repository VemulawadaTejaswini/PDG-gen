import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (true){
            String grade;
            int m=sc.nextInt();
            int f=sc.nextInt();
            int r=sc.nextInt();
            if (m==-1&&f==-1&&r==-1) break;
            if (m==-1||f==-1) grade="F";
            if (m+f>=80) grade="A";
            else if (m+f>=65) grade="B";
            else if (m+f>=50) grade="C";
            else if (m+f>=30){
                grade="D";
                if (r>=50) grade="C";
            }
            else grade="F";
            System.out.println(grade);
        }
    }
}