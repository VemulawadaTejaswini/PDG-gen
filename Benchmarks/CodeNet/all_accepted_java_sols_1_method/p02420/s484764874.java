import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String start;
        int numShuffle;
        int numTake;
        int i;
        while (true) {
            start = sc.next();
            if (start.equals("-")) break;
            numShuffle = sc.nextInt();
            for (i = 0; i < numShuffle; i++) {
                numTake= sc.nextInt();
                start = start.substring(numTake).concat(start.substring(0, numTake));
            }
            System.out.println(start);
        }
    }
}
