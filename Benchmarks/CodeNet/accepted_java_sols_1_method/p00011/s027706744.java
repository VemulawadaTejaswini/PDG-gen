import java.util.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int num[]=new int[w];
		for(int i=0;i<w;i++)
			num[i]=i+1;
		
		for(int i=0;i<n;i++){
			String[] data = sc.next().split(",");
			//System.out.println(data[0]+" "+data[1]);
			
			int a=Integer.parseInt(data[0]);
			int b=Integer.parseInt(data[1]);
			
			int tmp=num[a-1];
			num[a-1]=num[b-1];
			num[b-1]=tmp;
			//System.out.println(num[a-1]+" "+num[b-1]);	
			
		}
		for(int i=0;i<w;i++){
			System.out.println(num[i]);
		}
	}
}