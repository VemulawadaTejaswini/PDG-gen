import java.util.*;


class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();

        Map<Character, ArrayList<Integer>> idx = new HashMap<>();
        idx.put('R', new ArrayList<Integer>());
        idx.put('G', new ArrayList<Integer>());
        idx.put('B', new ArrayList<Integer>());

        long rcnt = 0;
        long gcnt = 0;
        long bcnt = 0;
        for (int i = 0; i < N; i++) {
            idx.get(S[i]).add(i);

            if(S[i] == 'R') rcnt++;
                        else if(S[i] == 'G') gcnt++;
                        else bcnt++;
        }


        long cnt = 0;
        for (int i = 1; i <= (N - 1) / 2; i++) {
            for (int j = 0; j < N - (i * 2); j++) {
                char ch1 = S[j];
                char ch2 = S[j + i];
                char ch3 = S[j + (i * 2)];
                if (ch1 != ch2 && ch2 != ch3 && ch1 != ch3) cnt++;
            }
        }

        System.out.println(rcnt*gcnt*bcnt-cnt);
    }
}
