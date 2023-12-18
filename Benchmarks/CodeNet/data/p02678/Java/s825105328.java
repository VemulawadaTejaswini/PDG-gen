import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Pair {
    int pare;
    int id;
    int depth;
    public Pair(int pare, int id, int depth) {
        this.pare = pare;
        this.id = id;
        this.depth = depth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append(", ");
        sb.append(pare);
        sb.append(", ");
        sb.append(depth);

        return sb.toString();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[M];
        int[] B = new int[M];

        List<List<Integer>> to = new ArrayList<>(100005);
        for (int i = 0; i < 100005; i++) {
            to.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();

            A[i]--;
            B[i]--;

            to.get(A[i]).add(B[i]);
            to.get(B[i]).add(A[i]);
        }

        int[] dist = new int[100005];
        Arrays.fill(dist, -1);
        int[] pare = new int[100005];
        Arrays.fill(pare, -1);

        Stack<Pair> stack = new Stack<Pair>();
        stack.push(new Pair(0, 0, 0));
        while (!stack.empty()) {
            Pair p = stack.pop();
            dist[p.id] = p.depth;
            pare[p.id] = p.pare;

            for (Integer nv : to.get(p.id)) {
                if (dist[nv] < 0) {
                    // parent, id, depth
                    stack.push(new Pair(p.id, nv, p.depth + 1));
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (i == 0) continue;
            if (dist[i] < 0) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        for (int i = 0; i < N; i++) {
            if (i == 0) continue;
            System.out.println(++pare[i]);
        }

        return;
    }

}
