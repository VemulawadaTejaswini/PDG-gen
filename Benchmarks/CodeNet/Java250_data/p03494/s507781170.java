import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		int[] num = new int[count];
		int[] max = new int[count];
		int maxOperate = 0;
		for(int i = 0 ; i < count ;i++) {
			num[i] = sc.nextInt();
			max[i] = 0;
			while((num[i]%2)==0) {
				num[i] = num[i]/2;
				max[i] += 1;
			}
			if(i == 0) {
				maxOperate = max[i];
			}else if(maxOperate > max[i]) {
				maxOperate = max[i];
			}
		}
		System.out.println(maxOperate);
	}

}
