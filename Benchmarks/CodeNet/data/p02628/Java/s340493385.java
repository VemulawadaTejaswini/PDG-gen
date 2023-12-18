import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int steps=sc.nextInt();
	    int price[]=new int[n];
	    int sum=0;
	    for(int i=0;i<n;i++){
	      price[i]=sc.nextInt();    
	    }
	    for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (price[j] > price[j+1]) 
                { 
                    int temp = price[j]; 
                    price[j] = price[j+1]; 
                    price[j+1] = temp; 
                }
        for(int i = 0; i < steps; i++){
            sum=sum+price[i];
        }        
	    System.out.println(sum); 
    }
}