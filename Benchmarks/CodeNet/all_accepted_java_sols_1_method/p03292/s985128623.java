import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		for(int n=0;n<3;n++){
			a[n] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println((a[1]-a[0])+(a[2]-a[1]));

	}
}