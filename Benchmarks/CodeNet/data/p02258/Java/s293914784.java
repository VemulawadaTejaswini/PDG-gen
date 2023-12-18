import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = sc.nextInt();
		int min = sc.nextInt();
		if(sc.hasNext()){

			for(int i =0;i<N-2;i++){
				int next = sc.nextInt();
				if(next-min>max-min){
					max = next;
				}
				if(max-next>max-min){
					min = next;
				}
			}
			System.out.println(max-min);

		}

	}

}

