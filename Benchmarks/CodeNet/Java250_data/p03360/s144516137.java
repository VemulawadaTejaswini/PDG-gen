import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		int ans = 0;
		List<Integer> inputList = new ArrayList<>();
		inputList.add(A);
		inputList.add(B);
		inputList.add(C);
		Collections.sort(inputList);
		ans = inputList.get(2);
		for(int i=0; i<K; i++) {
			ans *=2;
		}

		ans = ans + inputList.get(0) + inputList.get(1);

		System.out.println(ans);
	}


}