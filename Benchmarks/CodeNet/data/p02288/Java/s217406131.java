import java.util.*;
public class Main {
	    public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int [a*a];
		for(int i=1;i<=a;i++){
			arr[i]=sc.nextInt();
			
			for(int j=i;j>1;j=j/2){
				if(arr[j]>arr[j/2]){
					int b=arr[j];
					arr[j]=arr[j/2];
					arr[j/2]=b;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			if(arr[i]!=0)
				System.out.print(arr[i]+" ");
	    }
}

