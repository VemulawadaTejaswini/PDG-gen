import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int prev = 0;
        int longest = 0;
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            longest += Math.abs(array[i] - prev);
            prev = array[i];
        }
        longest += Math.abs(prev);
        int prevPosition = 0;
        int currentPosition = 0;
        int nextPosition = 0;
        for(int i = 0; i < n; i++) {
            if(i == n-1) {
                nextPosition = 0;
            } else {
                nextPosition = array[i+1];
            }
            currentPosition = array[i];
            if((prevPosition <= currentPosition && currentPosition <= nextPosition) ||
                    (prevPosition >= currentPosition && currentPosition >= nextPosition)) {
                System.out.println(longest);
            } else {
                int midPosition = prevPosition;
                if((currentPosition <= nextPosition && nextPosition <= prevPosition) ||
                        (prevPosition <= nextPosition && nextPosition <= currentPosition)) midPosition = nextPosition;
                System.out.println(longest - (Math.abs(currentPosition - midPosition) * 2));
            }
            prevPosition = array[i];
        }
    }
}