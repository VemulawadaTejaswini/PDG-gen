import java.util.Scanner;

public class Main{
       public static void main(String[] args){
       int i,j;
    	int[] a = new int[1000000];
    	int[] b = new int[1000000];
    	int[] k = new int[1000000];
    	int c; 
        Scanner scan = new Scanner(System.in);
       
        i = 0;
        while(scan.hasNextInt()){
        	a[i] = scan.nextInt();
        	b[i] = scan.nextInt();
        	c = a[i]+b[i];
        	j = 0;
        	while(c > 0){
        	c= c/10;
        	j++;
        	}
        	k[i] = j;
               	i++;
        }
        
        
        j = 0;
        while(j < i){
        	System.out.println(k[j]);
        	j++;
       		}
       		}
}