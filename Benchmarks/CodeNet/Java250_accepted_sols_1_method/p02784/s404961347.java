import java.util.*;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int HP = sc.nextInt();
        int hoge = sc.nextInt();
      	int waza = 0;
		for(int i = 0; i < hoge; i++){
			waza += sc.nextInt();
		}
		if(waza >= HP){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
	}
}