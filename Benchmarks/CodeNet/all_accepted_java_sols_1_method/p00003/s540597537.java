import java.util.*;

class Main{
	public static void main(String[] a){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] hen = new int[3];
		for(int i = 0 ; i < N ; i ++ ){
			for(int x = 0; x < 3 ; x++){
				hen[x] = scanner.nextInt();
			}
			Arrays.sort(hen);
			if(  (hen[2]*hen[2])  == (hen[0]*hen[0]  + hen[1]*hen[1]) ){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
    	}
}