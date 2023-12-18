import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
	
		int l[]=new int[n];
		for(int i=0;i<n;i++){
			l[i]=sc.nextInt();
		}
		
		int max=0;
		int total=0;
		
		for(int i=0;i<n;i++){
			if(l[i]>max){
				max=l[i];
			}
			total+=l[i];
		}
		
		if(max<total-max){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}