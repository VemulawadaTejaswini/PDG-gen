import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Integer a[] = new Integer[N];
        for (int i=0; i<N; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        Arrays.sort(a, Comparator.reverseOrder());

        player Alice = new player("Alice", 0);
        player Bob = new player("Bob", 0);
        for (int i=0; i<N; i+=2) {
            Alice.addSum(a[i]);
        }
        for (int i=1; i<N; i+=2) {
            Bob.addSum(a[i]);
        }
        System.out.println(Alice.getSum() - Bob.getSum());
    }
}

class player {
    private String name;
    private int sum;

    public player(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSum(int sum) {
        this.sum += sum;
    }

    public int getSum() {
        return this.sum;
    }
}