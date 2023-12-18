import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        
        while(true){
            int sum=0;
        	double ave;
        	int count=0;
        	int n=sc.nextInt();
            int[] a=new int[n];
            if(n==0)
                break;
        	for(int i=0;i<n;i++){
            	a[i]=sc.nextInt();
           		sum+=a[i];
        	}
        	ave=sum/n;
        
        	for(int i=0;i<n;i++){
            	if(ave>=a[i])
                count++;
        	}
        	System.out.println(count);
        
        
        
        }
        
    }
}
