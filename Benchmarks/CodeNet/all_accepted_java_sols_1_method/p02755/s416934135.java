import java.util.*;
import java.io.*;
public class Main{
  
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean found=false;
        for(int i=1;i<=10000;i++){

            if(((i*8)/100)==a && ((i*10)/100)==b){
                found=true;
                System.out.println(i+" ");
                break;
            }
        }
        if(!found){
            System.out.println(-1);
        }

    }
}