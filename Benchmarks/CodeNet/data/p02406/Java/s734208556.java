import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		call(sc.nextInt());
	}

	public static void call(int n){
		for(int i = 1;i <= n; i++){
			if(i % 3 == 0){
				System.out.printf(" %d",i);
			}else if(i % 10 == 3){
				System.out.printf(" %d", i);
			}else if(0 <= String.valueOf(i).indexOf('3')){
				System.out.printf(" %d", i);
			}
		}
		System.out.println();
	}
}


