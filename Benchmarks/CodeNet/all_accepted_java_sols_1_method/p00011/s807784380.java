import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();

		int[] values = new int[w];
		int temp;
		
		for(int i = 0;i < values.length;i++){
			values[i] = i+1;
		}

		for(int i = 0;i<n;i++){
			String str = sc.next();
			String[] ab = str.split(",");
			int a = Integer.parseInt(ab[0])-1;
			int b = Integer.parseInt(ab[1])-1;
			temp = values[a];
			values[a] = values[b];
			values[b] = temp;
		}	
		for(int j = 0;j <= w-1;j++){
			System.out.println(values[j]);
		}
		
	}
}