import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line=sc.nextLine();
        int n=Integer.parseInt(line);
        
        String[] line1=sc.nextLine().split(" ");
        int[] num=new int[n];
        
        for(int i=0;i<n;i++) {
        	num[i]=Integer.parseInt(line1[i]); 	
        }
       
		int count=0;
		
		for(int i=0;i<n;i++) {
        	if(i%2==0 && num[i]%2==1) {
        		count++;
        	}
        }

        System.out.println(count);
        
        
	}
  
}
