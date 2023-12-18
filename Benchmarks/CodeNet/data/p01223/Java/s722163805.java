import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,t,a[],i,j,high=0,low=0,temph=0,templ=0;
		a=new int [100];
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		//t=sc.nextInt();
		for(i=0;i<n;i++){
			t=sc.nextInt();
			for(j=0;j<t;j++){
				a[j]=sc.nextInt();
			}
			
			for(j=0;j<t-1;j++){
				if(a[j]<a[j+1]){
					temph=a[j+1]-a[j];
				}
				if(high<temph){
					high=temph;
				}

				if(a[j]>a[j+1]){
					templ=a[j]-a[j+1];
				}

				if(low<templ){
					low=templ;
				}
			}//j for
			System.out.println(high+" "+low);
			high=0;low=0;temph=0;templ=0;

		}//i for

	}// main

}