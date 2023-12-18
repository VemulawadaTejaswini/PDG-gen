import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] c=sc.next().toCharArray();
        sc.close();
        int l=c.length;
        if(l%2!=0){
            System.out.println("No");
            return;
        }
        for(int i=0;i<l/2;i++){
            if(c[i]!=c[i+l/2]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    
}
