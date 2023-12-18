import java.util.*;

class Main {

    static int answer[];

    static void makeTable() {
        answer = new int[10001];

        answer[0] = 1;

        for(int i = 1; i < 10001; i++) {
            answer[i] = answer[i-1] + i;
        }

    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        makeTable();

        while(sc.hasNext()) {
            System.out.println(answer[sc.nextInt()]);
        }




    }
}