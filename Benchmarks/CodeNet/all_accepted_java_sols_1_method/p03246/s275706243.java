import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int MAX = 100001;
        
        final int n = sc.nextInt();
        
        final int[] evenCount = new int[MAX];
        final int[] oddCount = new int[MAX];
        
        for (int i = 0; i < n / 2; i++) {
            evenCount[sc.nextInt()]++;
            oddCount[sc.nextInt()]++;
        }
        
        int even1st = evenCount[0] < evenCount[1] ? 1 : 0;
        int even2nd = evenCount[0] < evenCount[1] ? 0 : 1;
        int odd1st = oddCount[0] < oddCount[1] ? 1 : 0;
        int odd2nd = oddCount[0] < oddCount[1] ? 0 : 1;
        
        for (int i = 2; i < MAX; i++) {
            if (evenCount[even1st] < evenCount[i]) {
                even2nd = even1st;
                even1st = i;
            } else if (evenCount[even2nd] < evenCount[i]) {
                even2nd = i;
            }
            if (oddCount[odd1st] < oddCount[i]) {
                odd2nd = odd1st;
                odd1st = i;
            } else if (oddCount[odd2nd] < oddCount[i]) {
                odd2nd = i;
            }
        }
        
        int evenAdopt;
        int oddAdopt;
        
        if (even1st != odd1st) {
            evenAdopt = even1st;
            oddAdopt = odd1st;
            
        } else if (evenCount[even1st] + oddCount[odd2nd] < evenCount[even2nd] + oddCount[odd1st]) {
            evenAdopt = even2nd;
            oddAdopt = odd1st;
            
        } else {
            evenAdopt = even1st;
            oddAdopt = odd2nd;
        }
        
        System.out.println(n - evenCount[evenAdopt] - oddCount[oddAdopt]);
    }
}
