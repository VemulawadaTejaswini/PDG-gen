import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		List<Integer> inputList = new ArrayList<>();
		sc.nextLine();
        for (int i = 0; i < K; i++) {
        	inputList.add(sc.nextInt());
        }

        int ans = N;

        nLoop : while (true) {
        	String ansString = String.valueOf(ans);
        	for (Integer d : inputList) {
            	if (ansString.contains(String.valueOf(d))) {
            		ans++;
            		continue nLoop;
            	}
            }
        	System.out.println(ans);
        	break;
        };




	}
}