import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());

        int[] rates = new int[count];
        for (int i = 0; i < count; i++) {
        	rates[i] = Integer.parseInt(sc.nextLine());
        }

        int min = rates[0];
        int max = rates[1] - rates[0];
        for (int i = 1; i < count; i++) {
        	max = Math.max(max, rates[i] - min);
        	min = Math.min(min, rates[i]);
        }

        System.out.println(max);
    }

}
