import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int GoukeiMasu = sc.nextInt() + 1;
		int ryokinjyoSuu = sc.nextInt();
		int syokaiIti = sc.nextInt();
		List<Integer> ryokinjyoItiList = new ArrayList<Integer>();
		for(int i=0;i<ryokinjyoSuu;i++) {
			ryokinjyoItiList.add(sc.nextInt());
		}
		//左に行く
		int imanoIti = syokaiIti;
		int hidariRyokin = 0;
		while(imanoIti != 0) {
			imanoIti--;
			if(ryokinjyoItiList.contains(imanoIti)) {
				hidariRyokin++;
			}
		}
		//右に行く
		imanoIti = syokaiIti;
		int migiRyokin = 0;
		while(GoukeiMasu != imanoIti) {
			imanoIti++;
			if(ryokinjyoItiList.contains(imanoIti)) {
				migiRyokin++;
			}
		}
		System.out.println((hidariRyokin<migiRyokin)?hidariRyokin:migiRyokin);
	}
}