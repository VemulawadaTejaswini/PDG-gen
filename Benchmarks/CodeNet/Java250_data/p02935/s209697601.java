import java.util.*;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] numArray = new int[n];

		for(int i = 0; i < n; i++){
			numArray[i] = sc.nextInt();
        }

        Arrays.sort(numArray);
        double value = (numArray[0] + numArray[1]) / 2.0;
        for(int i = 2; i < n; i++){
            value = (value + numArray[i]) / 2.0;
        }

        System.out.println(value);

	}
}