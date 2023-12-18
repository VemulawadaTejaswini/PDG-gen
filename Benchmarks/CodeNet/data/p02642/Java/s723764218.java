import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.next());

		ArrayList<Integer> list = new ArrayList<Integer>(N);

		for(int i=0;i<N;i++) {
			list.add(Integer.parseInt(scanner.next()));
		}
		int count =0;
		int miniCount = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(j != i && list.get(i)%list.get(j) == 0) {
					miniCount++;
					break;
				}
			}
			if(miniCount ==0) {
				count++;
			}
			miniCount = 0;
		}
		System.out.print(count);

		scanner.close();
	}
}