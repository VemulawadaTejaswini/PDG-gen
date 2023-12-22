import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            n-=sc.nextInt();
        }
        if(n>=0){
            System.out.println(n);
        }else{
            System.out.println(-1);
        }
    }
}