import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = 0;
		int pmu[] = {a + b, a - b, a * b};
		for(int i = 1; i < pmu.length;i++) {
		    if (pmu[i] > pmu[max]) {
		        max = i;
		    }
		}
		System.out.println(pmu[max]);
		

	}

}

