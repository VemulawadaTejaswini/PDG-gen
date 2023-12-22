import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int temp;
		int[] a = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) a[i]=sc.nextInt();
		for(int i=0; i<3; i++){
			if(a[i%2] > a[i%2+1]){
				temp=a[i%2];
				a[i%2]=a[i%2+1];
				a[i%2+1]=temp;
			}
		}
		System.out.println(a[0] +" "+ a[1] +" "+ a[2]);
	}
}