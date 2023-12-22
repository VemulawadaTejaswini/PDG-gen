import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.valueOf(sc.next());
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=Integer.valueOf(sc.next());
		}
		sc.close();
		
		int count=0;
		boolean f=true;
		while(f){
			f=false;
			for(int i=n-1;i>0;i--){
				int a=arr[i];
				int b=arr[i-1];
				if(a<b){
					arr[i]=b;
					arr[i-1]=a;
					count++;
					f=true;
				}
			}
			
		}
		System.out.print(arr[0]);
		for(int i=1;i<n;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.println(count);
	}

}