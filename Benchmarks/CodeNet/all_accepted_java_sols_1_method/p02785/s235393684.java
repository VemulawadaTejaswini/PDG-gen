import  java.util.*;


import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int ar[] = new int[a];
        int i, j = 0;
        for (i = 0; i < a; i++) {
            ar[i] = sc.nextInt();
        }
        if(b>=a){
            System.out.println("0");
        }
        else {

            sort(ar);
        
            long  sum = 0;
            for (i = 0; i <a-b; i++) {
                sum = sum + ar[i];
            }

            System.out.println(sum);
        }
    }
}