import java.util.Scanner;
public class Main {
public static void main(String args[]){
	int size=1000,sum;
	double a,b;
	int[] list=new int[size];
	Scanner sc=new Scanner(System.in);
	while(true){
		int n=sc.nextInt();
	if(n==0){
		break;
	}else{
		sum=0;
	for(int i=0;i<n;i++){
		int input=sc.nextInt();
		list[i]=input;
		sum+=list[i];
	}
	a=0;
	for(int j=0;j<n;j++){
	    a+=Math.pow(list[j]-(double)sum/n,2)/n;
	}
	b=Math.sqrt(a);
	System.out.println(b);
	}
	}
}
}