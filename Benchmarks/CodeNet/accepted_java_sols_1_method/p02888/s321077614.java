import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int input[] = new int [N];

        for (int i = 0 ; i< N ; i++) {
        	input[i] = sc.nextInt();
        }
        sc.close();


        int count = 0;
        Arrays.sort(input);

        for (int i = 0 ; i< N - 2  ; i++) {
        	for(int j = i + 1; j < N - 1 ; j++) {
                for (int k = j + 1 ; k < N ; k++) {
                	 if ( input[i] + input[j] <= input[k]) {
                		 break;
                	 }
                	 count++;
                }
        	}
        }
    	System.out.println(count);
    }
}