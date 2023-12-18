import java.util.*;

public class List_of_Top_3_Hills {
	private static Scanner in;
	public static void main(String[] args) {
		int hight[] = new int[10];
		
		in = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
			hight[i] = in.nextInt();
		}
		Arrays.sort(hight);
		
		for(int i = 9 ; i > 6; i--){
			System.out.println(hight[i]);
		}
	}
}