import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int n=0;
        for(int i=a;i<=b;i++){
            if(c%i==0){
                n++;
            }
        }
        System.out.println(n);
    }
}

