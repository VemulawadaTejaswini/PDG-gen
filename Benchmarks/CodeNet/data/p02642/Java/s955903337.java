import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

        int[] A=new int[N+10];
        
        int h=0;

        for(h=0;h<N;h++){
            A[h]=sc.nextInt();
        }

        int i=0;
        int j=0;
        int calc=0;
        int count=0;
        
        for(i=0;i<N;i++){
            for(j=0;j<N;j++){
                if(i!=j){
                    calc=A[i]%A[j];
                    
                    if(calc==0){
                        break;
                    }
                    
                    if(j==N-1){
                        count++;
                    }
                }
            }
        }
        
        System.out.println(count);

        //END
    }
}



