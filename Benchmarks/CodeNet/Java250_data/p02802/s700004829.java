import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Problem> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Problem());
        }

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            String result = sc.next();
            Problem p = list.get(num-1);
            if (result.equals("AC")) {
                p.isAc = true;
            } else if (p.isAc == false) {
                p.submit++;
            }
        }

        int acNum = 0;
        int waNum = 0;
        for (int i = 0; i < n; i++) {
            Problem p = list.get(i);
            if (p.isAc) {
                acNum++;
                waNum += p.submit;
            }
        }
        System.out.printf("%d %d", acNum, waNum);
    }

    class Problem {
        int submit = 0;
        boolean isAc = false;
    }
}
