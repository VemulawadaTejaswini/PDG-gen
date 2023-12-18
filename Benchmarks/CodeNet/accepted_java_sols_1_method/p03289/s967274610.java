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
        
        
        
        
        
        
        public static void main(String[]args){
                String S=sc.next();
                int n=S.length();
                int x=0;
                if(S.charAt(0)=='A'){
                        if(Character.isLowerCase(S.charAt(1))){
                                for(int i=2;i<n-1;i++){
                                        if((Character.isLowerCase(S.charAt(i)))||((S.charAt(i)=='C')&&(x==0))){
                                                if(S.charAt(i)=='C'){
                                                        x++;
                                                }

                                        }else{
                                                System.out.println("WA");
                                                x=100;
                                                break;
                                                
                                        }

                                }
                                if(x!=100){
                                if((Character.isLowerCase(S.charAt(n-1)))&&(x==1)){
                                        System.out.println("AC");
                                }else{
                                        System.out.println("WA");
                                }}



                        }else{
                                System.out.println("WA");
                        }
                }else{
                        System.out.println("WA");
                }


                
                
                
                


                
        }
        
        
        

		
	
}
