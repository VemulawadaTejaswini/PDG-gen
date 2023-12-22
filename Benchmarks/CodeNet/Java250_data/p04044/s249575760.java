import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        List<String> S = new ArrayList<String>();
        for (int i = 0 ; i < N; i++) {
            S.add(sc.next());
        }
        Collections.sort(S);

        StringBuilder ans = new StringBuilder();
        for (String s :S) {
            ans.append(s);
        }
        System.out.println(ans.toString());

        return;
    }

}