

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc=new Scanner(System.in);
        int book[]=new int[4];
        int n=sc.nextInt();     
        for(int i=0;i<4;i++){
            book[i]=0;
        }
        for(int i=0;i<n;i++){
            String s=sc.next();
            if(s.equals("P")){
                book[0]=1;
            }
            else if(s.equals("W")){
                book[1]=1;
            }
            else if(s.equals("G")){
                book[2]=1;
            }
            else{
                book[3]=1;
            }
        }
        int sum=book[0]+book[1]+book[2]+book[3];
        if(sum==3)
            System.out.println("Three");
        else{
            System.out.println("Four");
        }
    }
}
