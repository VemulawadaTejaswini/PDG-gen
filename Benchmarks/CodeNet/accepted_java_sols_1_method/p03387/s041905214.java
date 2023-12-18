import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int[] a=new int[3];
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();
		Arrays.sort(a);
		if((a[2]-a[0])%2==0 && (a[2]-a[1])%2==0) {
			System.out.println((a[2]-a[0])/2+(a[2]-a[1])/2);
		}else if((a[2]-a[0])%2!=0 && (a[2]-a[1])%2!=0) {
			System.out.println((a[2]-a[0]-1)/2+(a[2]-a[1]-1)/2+1);
		}else {
			a[0]++;
			a[2]++;
			if((a[2]-a[0])%2==0 && (a[2]-a[1])%2==0) {
				System.out.println((a[2]-a[0])/2+(a[2]-a[1])/2+1);
			}else{
				System.out.println((a[2]-a[0]-1)/2+(a[2]-a[1]-1)/2+2);
			}
		}
	}
}

