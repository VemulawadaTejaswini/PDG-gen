import java.util.Scanner;
public class Main{
	public static void main(String[]args){
    	Scanner sc=new Scanner(System.in);
     	int n=sc.nextInt();
      	int total=0;
      	int p[]=new int[n];
      
      	for(int t=0;t<n;t++){
        	p[t]= sc.nextInt();
        }
      	
      	for(int k=0;k<n-2;k++){
        	if(p[k]<p[k+1]){
            	if(p[k+1]<p[k+2]){
                	total+=1;
                }
            }else{
            	if(p[k+2]<p[k+1]){
                	total+=1;
                }
            }
        }
      	
      	System.out.println(total);
      
      
    }
}