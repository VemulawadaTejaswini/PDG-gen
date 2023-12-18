import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[]=new int[a];
		int count=0,c=1;
		for(int i=0;i<a;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<a;i++){
			count+=arr[i];
			if(count<=b)
				c++;
		}
		System.out.println(c);
	}
}