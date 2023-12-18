import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			a.add(sc.nextInt());
		}
		int N = sc.nextInt();
		int res = 0;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			int index = a.indexOf(num);
			if (-1 < index) {
				res += Math.pow(2,index);
			}
		}
		int[] yesArr = {7, 56, 448, 73, 146, 292, 273, 84};
        boolean bingo = false;
        for (int yes : yesArr) {
            if ((res & yes) == yes) {
                bingo = true;
                break;
            }
        }
        System.out.println(bingo ? "Yes" : "No");
	}
}