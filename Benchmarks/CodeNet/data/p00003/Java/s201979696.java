import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<n;i++){
			String[] s = sc.nextLine().split("[\\s]+");
			int[] data = new int[3];
			
			for(int k=0;k<3;k++){
				data[k] = Integer.parseInt(s[k]);
			}
			Arrays.sort(data);
			
			if(data[0]*data[0]+data[1]*data[1] == data[2]*data[2]) System.out.println("YES");
			else{System.out.println("NO");}
		}
		
	}
}