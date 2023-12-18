import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int lengths[] = new int[n];
        for(int i = 0; i < lengths.length; i++) {
            lengths[i] = scan.nextInt();
        }
        int longestID, othersSum;

        longestID = 0;
        for(int i = 1; i < lengths.length; i++) {
            if(lengths[i] >= lengths[longestID]) {
                longestID = i;
            }
        }

        othersSum = 0;
        for(int i = 0; i < lengths.length; i++) {
            if(i != longestID) {
                othersSum += lengths[i];
            }
        }

        if(lengths[longestID] < othersSum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
        return;
    }
}