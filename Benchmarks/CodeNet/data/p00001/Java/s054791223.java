import java.util.*;

public class Mountain1 {
	
	public static void main (String[] args){
		
		int h[]={1819,2003,876,2840,1723,1673,3776,2848,1592,922};
		
		int temp;
		
					for (int j=h.length-1;j>0;j--){
					for(int i=0;i<j;i++ )
					if (h[i]<h[i+1]){
						
						temp=h[i+1];
						
						h[i+1]=h[i];
						
						h[i]=temp;}
				}
					
					for(int i=0;i<=2;i++){
						System.out.println(h[i]);
						
					}
				
				}}