import java.util.*;

class Main {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> times = new ArrayList<Integer>();

        for(int i = 0; i < 101; i++)    times.add(0);

        while(sc.hasNext()) {
            int i = sc.nextInt();
            times.set(i, times.get(i) + 1);
        }

        int max = Collections.max(times);

        for(int i = 0; i < 101; i++) {
            if (times.get(i) == max)    System.out.println(i);
        }

    }
}