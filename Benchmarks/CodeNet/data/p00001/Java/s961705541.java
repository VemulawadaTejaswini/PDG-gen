import java.util.*;

class main {
	public static void main(String[] args){
		
		int[] height = new int[10];
		
		for(int j=0; j<10; j++){
			Scanner i = new Scanner(System.in);
			height[j] = i.nextInt();
		}
		Arrays.sort(height);
		
		for(int j=9; j>6; j--){
			System.out.println(height[j]);
		}
		
	}
}