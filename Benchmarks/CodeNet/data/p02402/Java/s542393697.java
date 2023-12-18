import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); 
		
		int x = scan.nextInt();
		int n[] = new int[x];
		int min, max, sam;
		
		for(int i = 0; i < x; i++){
			n[i] = scan.nextInt();
		}
		
		min = n[0];
		max = n[0];
		sam = 0;
		
		for(int i = 0; i < x; i++){
			if(max < n[i]){
				max = n[i];
			}
			if(min > n[i]){
				min = n[i];
			}
		}
		
		for(int i = 0; i < x; i++){
			sam += n[i];
		}
		
		System.out.println(min + " " + max + " " + sam);
	}
}