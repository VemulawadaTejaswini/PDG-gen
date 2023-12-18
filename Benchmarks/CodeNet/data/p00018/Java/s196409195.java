import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++){
			for(int j=4;j>i;j--){
				if(a[j]<a[j-1]){
					int box=a[j];
					a[j]=a[j-1];
					a[j-1]=box;
				}
			}
		}
		for(int i=4;i>=0;i--){
			if(i==4){
				System.out.print(a[i]);
			}else{
				System.out.print(" "+a[i]);	
			}
		}
		System.out.println();
	}
}