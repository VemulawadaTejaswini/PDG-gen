import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x;
		int n = 0;
		int[] data = new int[100];

		for(int i = 0;;i++){
			x = sc.nextInt();
			if(x == 0)
				break;
			data[i] = x;
			n++;
		}
		
		for(int i = 0;i < n;i++){
			System.out.println("case "+(i + 1)+": "+data[i]);
		}
	}
}