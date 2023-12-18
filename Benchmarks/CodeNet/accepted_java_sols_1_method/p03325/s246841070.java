import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;


 
public class Main{
	
        static final Scanner sc=new Scanner(System.in);
        static int N=sc.nextInt();
        static long[]a=new long[N];
        
        
        public static void main(String[]args){
                int sum=0;

                for(int i=0;i<N;i++){
                        a[i]=sc.nextLong();}
                        long x=0;
                for(int i=0;i<N;i++){
                        x=a[i];
                        for(;;){
                                if(x%2==0){
                                        sum++;
                                        x=x/2;
                                }else{
                                        break;
                                }
                        }

                }
                System.out.println(sum);
                
                

        }
        
        
        

		
	
}
