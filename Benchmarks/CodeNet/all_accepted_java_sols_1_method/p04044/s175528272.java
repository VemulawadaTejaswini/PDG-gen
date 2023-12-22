import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int L = sc.nextInt();

		List<String> inputList = new ArrayList<>();
		sc.nextLine();
        for (int i = 0; i < N; i++) {
        	inputList.add(sc.nextLine());
        }

        Collections.sort(inputList);

        StringBuffer sb = new StringBuffer();
        for (String input : inputList) {
        	sb.append(input);
        }

        System.out.println(sb.toString());

	}
}