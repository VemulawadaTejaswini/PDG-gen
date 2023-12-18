import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] data = new int[n];
		for(int i = 0 ; i < n ; i ++){
			data[i]=scan.nextInt();
		}
		for(int i = 1 ; i <= n ; i ++){
			System.out.print("node "+i+": key = "+data[i-1]+", ");
			if(i/2>0){
				System.out.print("parent key = "+data[i/2-1]+", ");
			}
			if(2*i<=n){
				System.out.print("left key = "+data[i*2-1]+", ");
			}
			if(2*i+1<=n){
				System.out.print("right key = "+data[i*2]+", ");
			}	
			System.out.println("");
		}
	}

}