import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] line = sc.next().toCharArray();

        int numOfEOnRightSide = 0;
        int numOfWOnLeftSide = 0;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (line[i] == 'E') {
                numOfEOnRightSide++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (line[i] == 'W'){
                ans = Math.min(numOfWOnLeftSide + numOfEOnRightSide, ans);
                numOfWOnLeftSide++;
            }
            if (line[i] == 'E') {
                numOfEOnRightSide--;
                ans = Math.min(numOfWOnLeftSide + numOfEOnRightSide, ans);
            }

        }

        System.out.println(ans);
    }

}