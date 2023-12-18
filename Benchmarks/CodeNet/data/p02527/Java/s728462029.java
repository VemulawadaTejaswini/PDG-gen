import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		int[] b=new int[1000000];
		int n =scan.nextInt();
		for(int i=0;i<n;i++){
			b[i]=scan.nextInt();
		}
		for(int i=0;i<n-1;i++){
			for(int i2=i+1;i2<n;i2++){
				if(b[i]>b[i2]){
					int temp=b[i2];
					b[i2]=b[i];
					b[i]=temp;
				}
			}
		}
		for(int i=0;i<n-1;i++){
			System.out.print(b[i]+" ");
		}
		System.out.println(b[n-1]);
	}
}