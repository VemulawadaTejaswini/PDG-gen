import java.io.IOException;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int count=0;
		while(scan.hasNext()){	
			num= scan.nextInt();
			boolean[] prime = new boolean[num+1]; 
			for(int b=2;b<=num;b++)
				prime[b-2]=true;
			for(int i=2;i<Math.sqrt(num);i++){
				for(int j=2;j*i<=num;j++){
					prime[i*j-2] = false;
				}
			}
		    for(int i=0;i<num;i++){
		    	if(prime[i])
		    		count++;
		    }
	        System.out.println(count);
			count=0;
		}
	}	
}