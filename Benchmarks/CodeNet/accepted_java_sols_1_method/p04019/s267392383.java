import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String direction = "NSEW";
        int[] dirCount = new int[4];

        for (int i = 0; i < S.length(); i++) {
            dirCount[direction.indexOf(S.charAt(i))] ++;
        }

        boolean resultNS = (dirCount[0] == 0 && dirCount[1] == 0) ||
                (dirCount[0] != 0 && dirCount[1] != 0);
        boolean resultEW = (dirCount[2] == 0 && dirCount[3] == 0) ||
                (dirCount[2] != 0 && dirCount[3] != 0);

        System.out.println( (resultNS && resultEW) ? "Yes" : "No" );
    }
}
