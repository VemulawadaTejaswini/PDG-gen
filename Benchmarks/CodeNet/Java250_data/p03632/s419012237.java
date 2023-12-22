import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int D=sc.nextInt();
        if((C>=A)&&(C<=B)){
            System.out.println(Math.min(B,D)-C);
        }else if((A>=C)&&(D>=A)){
            System.out.println(Math.min(B,D)-A);
        }else{
            System.out.println(0);
        }

        }
        
        
    }
