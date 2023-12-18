import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().AOJ0554();
	}
	Scanner sc = new Scanner(System.in);
	
	void AOJ0554(){
		int input = 0;
		for(int i = 0; i < 4 ; i++){
			input += sc.nextInt();
		}
		
		System.out.printf("%d\n%d\n",input/60,input%60);
		
	}
	
}