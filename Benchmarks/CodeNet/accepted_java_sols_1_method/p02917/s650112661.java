import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] list = new int[N-1];
        for (int i = 0 ; i < N-1 ; i++) {
        	list[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        int sum = list[0] + list[N-2];
        for(int i = 0 ; i < N-2 ; i++) {
        	sum += Math.min(list[i], list[i+1]);
        }

		System.out.println(sum);


    }
}