import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int alphabet = 0;
		int refrain = 0;
		if(a < b){
			alphabet = a;
			refrain = b;
		}else{
			alphabet = b;
			refrain = a;
		}
		for(int i = 0; i < refrain; i++){
			System.out.print(alphabet);
		}
		System.out.println("");
	}
}