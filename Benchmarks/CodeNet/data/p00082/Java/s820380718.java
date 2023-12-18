import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args){
      		int[] c = {1,2,1,2,1,4,1,4,1,2,1,2,1,4,1,4};
			Scanner sc = new Scanner(System.in);
      		int[] p = new int[8];
      		int result;
      		while(sc.hasNextInt()){
      		//int[] remnants = new int[8];
              int remnants;
              for(int i=0; i<8; i++){
                p[i] = sc.nextInt();
              }
              int minremnants=10000;
              int min=0;
              for(int c_i=0; c_i<8; c_i++){
                //remnants[c_i]=0;
                remnants=0;
              	for(int p_i=0; p_i<8; p_i++){
                	int tmp=p[p_i]-c[c_i+p_i];
                  	//System.out.println("p:"+p[p_i]+"c:"+c[c_i+p_i]+"tmp:"+tmp);
                	if(tmp>0){
                		//remnants[c_i]=remnants[c_i]+tmp;
                		remnants=remnants+tmp;
                    }
                }
                 if(remnants<minremnants){
                   min=c_i;
                   minremnants=remnants;
                 }
              }
              for(int i=0; i<7; i++){
              	System.out.print(c[min+i]+" ");
              }
              	System.out.println(c[min+7]);
            }
      		
    }
}

