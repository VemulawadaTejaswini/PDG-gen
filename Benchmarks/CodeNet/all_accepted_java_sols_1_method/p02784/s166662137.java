import java.util.*;


public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int N=sc.nextInt();
        int A=0;
        while(N-->0){
            A=A+sc.nextInt();
        }
        if(A<H)System.out.println("No");
        else System.out.println("Yes");
    }
}
        
        

