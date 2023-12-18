import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n<=0||n>100){
			return;
		}
		int data[]=new int[n];
		for (int i=0;i<n;i++){
			data[i]=s.nextInt();
		}
		for(int j=n-1;j>0;j--){
			System.out.printf("%d ",data[j]);
		}
		System.out.printf("%d",data[0]);
	}
}