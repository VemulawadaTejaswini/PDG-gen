import java.util.*;
//import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a==-1 && b==-1 && c==-1) break;
            int sum=a+b;
            if(a==-1 || b==-1 || sum<30) System.out.println("F");
            else if(sum<50){
                if(c>=50) System.out.println("C");
                else System.out.println("D");
            }
            else if(sum<65) System.out.println("C");
            else if(sum<80) System.out.println("B");
            else System.out.println("A");
        }
        sc.close();
    }
}
