import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] nk = line.split(" ");
        int N = Integer.parseInt(nk[0]);
        int K = Integer.parseInt(nk[1]);

        String[] diceStr = sc.nextLine().split(" ");
        Double[] dice = new Double[N];
        for(int i = 0; i < diceStr.length ; i++) {
        	dice[i] = Double.parseDouble(diceStr[i]);
        }
        sc.close();

        for(int i = 0; i < dice.length; i++) {
        	dice[i] = (dice[i]+1)/2;
        }

        double max = 0.0000;
        for(int i =0; i < K; i++) {
        	max += dice[i];
        }
        double comp1 = max ;
        for(int i =0; i < dice.length-K;i++ ) {
        	comp1 = (comp1 + dice[i+K]-dice[i]);
        	if(max < comp1) {
        		max = comp1;
        	}
        }

        System.out.println(max);

	}

}