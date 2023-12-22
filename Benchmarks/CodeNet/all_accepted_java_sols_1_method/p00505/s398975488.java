import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ok = true;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		while(sc.hasNext()) {
			int[] list = new int[3];
			for(int i = 0; i < 3; i++) {
				list[i] = sc.nextInt();
			}
			if(!ok) continue;
			Arrays.sort(list);
			if(list[0] + list[1] <= list[2]) ok = false;
			else {
				a++;
				if(list[0]*list[0] + list[1] * list[1] < list[2] * list[2])c++;
				else if(list[0]*list[0] + list[1] * list[1] > list[2] * list[2]) d++;
				else b++;
			}
		}
		System.out.println(a + " " + b + " " + d + " " + c);

	}



}