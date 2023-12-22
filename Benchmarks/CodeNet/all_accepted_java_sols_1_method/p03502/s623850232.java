import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		char[] N_array = N.toCharArray();


    	int sum = 0;
    	for (int i = 0; i < N_array.length; i++) {
			sum += Character.getNumericValue(N_array[i]);
		}

    	if (Integer.parseInt(N) % sum == 0){
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
	}
}