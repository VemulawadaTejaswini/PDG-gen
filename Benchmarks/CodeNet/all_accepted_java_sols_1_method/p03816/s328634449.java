import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] list=new int[n];
		int[] count=new int[100001];
		int number=0;
		for(int i=0;i<n;i++){
			list[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			count[list[i]]++;
		}
		for(int i=0;i<100001;i++){
			if(count[i]>0)number++;
		}
		if(number%2==0)System.out.println(number-1);
		else System.out.println(number);
	}
		
}