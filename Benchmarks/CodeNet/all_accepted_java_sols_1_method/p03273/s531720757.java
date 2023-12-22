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
                int H=sc.nextInt();
                int W=sc.nextInt();
                String[]moji=new String[H];
                for(int i=0;i<H;i++){
                        String a=sc.next();
                        boolean x=true;
                        for(int j=0;j<W;j++){
                                if(a.charAt(j)=='#'){
                                        x=false;
                                        break;
                                }
                        }
                        if(x){
                                i--;
                                H--;
                        }else{
                        moji[i]=a;}
                }
                for(int i=0;i<W;i++){
                        boolean xx=true;
                        for(int j=0;j<H;j++){
                                if(moji[j].charAt(i)=='#'){
                                        xx=false;
                                        break;
                                }

                        }
                        if(xx){
                                for(int j=0;j<H;j++){
                                        moji[j]=moji[j].substring(0,i)+moji[j].substring(i+1,W);
                                        
                                }
                                i--;
                                W--;

                                
                        }
                }
                for(int i=0;i<H;i++){
                        System.out.println(moji[i]);
                }
                




                
                


                
        }
        
        
        

		
	
}
