import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
        int[] list = new int[5];
		for( int i =1; i < 6 ; i++ ){
			int cnt = Integer.parseInt(sn.next());
			if (cnt == 0){
				System.out.println(i);
			}
		}
	}
}

