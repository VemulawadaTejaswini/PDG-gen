import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int array[] = new int[N*2];
		for(int i=0; i<N*2;i++){
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		int count=0;
		for(int i=0;i<N*2;i=i+2){
			count+=array[i];
		}
		System.out.println(count);
	}
}