import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sc.close();
        for(int i=0;i<=x;i++){
            if(100*i<=x && x<=105*i){
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
        return;
    }
}