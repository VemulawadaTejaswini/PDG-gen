//Volume5-0583
import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int   n,max;
		int[] m = {0,0,0};
		n=sc.nextInt();
		for(int i=0;i<n;i++){
			m[i]=sc.nextInt();
		}
		Arrays.sort(m);
		max = (m[2]+1)/2;

		if(n==2){
			for(int i=1;i<max;i++){
				if(m[1]%i==0 && m[2]%i==0){
					System.out.println(i);
				}
			}
		}
		if(n==3){
			for(int i=1;i<max;i++){
				if(m[0]%i==0 && m[1]%i==0 && m[2]%i==0){
					System.out.println(i);
				}
			}
		}
	}
}