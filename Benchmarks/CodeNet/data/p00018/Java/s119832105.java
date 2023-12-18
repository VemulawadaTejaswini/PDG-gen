import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\r\\n");
		String b[] = sc.next().split(" ");
		int[] a = new int[5];
		for(int i=0;i<5;i++){
			a[i] = Integer.parseInt(b[i]);
		}
		for(int i=0;i<4;i++){
			int temp = 0;
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]<a[j+1]){
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i < a.length;i++){
			System.out.print(a[i]);
			if(i == 4){
				break;
			}else{
				System.out.print(" ");
			}
		}
	}
}