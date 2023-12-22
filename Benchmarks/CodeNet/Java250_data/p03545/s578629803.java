import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        int[] A = new int[4];

        for (int i = 0; i < 4; i++) {
            A[i] = S[i] - '0';
        }

        for (int bit = 0; bit < (1 << 3); bit++) {
            List<Character> list = new ArrayList<Character>();

            //System.out.println(String.format("%4s",Integer.toBinaryString(bit)));
            int k = 0;
            int sum = A[0];
            for (int i = 0; i < 3; i++, k++) {
                //System.out.println("\t" + String.format("%4s", Integer.toBinaryString((1 << i))) + " ");
                if ((bit & (1 << i)) > 0) {
                    sum += A[i+1];
                    list.add('+');
                } else {
                    sum -= A[i+1];
                    list.add('-');
                }
            }

            //for (Character c : list) System.out.print(c);
            //System.out.println(" "+ sum);
            if (sum == 7) {
                StringBuilder sb = new StringBuilder();
                sb.append(S[0]);
                for (int i = 0; i < 3; i++) {
                    sb.append(list.get(i));
                    sb.append(S[i + 1]);
                }
                sb.append("=7");
                System.out.println(sb.toString());
                return;
            }

        }

        return;
    }

}