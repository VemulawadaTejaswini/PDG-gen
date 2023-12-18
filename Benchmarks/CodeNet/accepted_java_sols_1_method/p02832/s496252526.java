import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j=0;
        for(int i=0;i<n;i++){
            if(sc.nextInt()-1==j){
                j++;
            }
        }
        if(j>0){
            System.out.println(n-j);
        }else{
            System.out.println(-1);
        }
    }
}