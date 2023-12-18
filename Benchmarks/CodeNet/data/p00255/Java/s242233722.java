import java.util.*;
public class Main{
	Scanner sc=new Scanner(System.in);
	void a(){
		while(true){
    		int n=sc.nextInt();
			if(n==0)break;
			int[] jo=new int[n-1];
			int p=0;
			for(int i=0; i<n; i++)p+=sc.nextInt();
			for(int i=0; i<n-1; i++)jo[i]=sc.nextInt();
			for(int i=0; i<n-2; i++){
	 			for(int j=i+1; j<n-1; j++){
					if(jo[i]<jo[j]){
						int a =jo[i];
						jo[i]=jo[j];
	  			  		jo[j]=a;
					}
				}
	 	 	}
			int max=0;
			for(int i=0; i<n; i++){
				if(max<=p*(n-i))max=p*(n-i);
				if(i<n-1)p+=jo[i];
			}
			System.out.println(max);
			
		}
	}
		
	public static void main(String[]agrs){
		new Main().a();
	}
}