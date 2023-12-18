import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bufa;
		int[] a = new int[3];
		for(int i:a){
			i = sc.nextInt();
		}
		for(int i = a.length-2;i > 1;i--){
			for(int j=0; j < i;j++){
				if(a[j]>a[j+1]){
					bufa = a[j+1];
					a[j+1] = a[j];
					a[j] = bufa;
				}
			}
		}
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
	}

}