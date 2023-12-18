import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		int arr[]=new int[z];
		int con=0;
		for(int i = 0;i <z;i++)
			arr[i] = sc.nextInt();
		
		for(int a=0;a<arr.length;a++){
			int min = a;
			
			for(int s=a;s<arr.length;s++){
				if(arr[s]<arr[min])
					min = s;				
			}
			
			if(a!=min){
				int temp=arr[a];
				arr[a]=arr[min];
				arr[min]=temp;
				
				con=con+1;
			}
		}
		
		System.out.println();
		for(int i=0;i<z;i++)
			System.out.print(arr[i] + " ");
		
		System.out.println("\n"+con);
	}

}

