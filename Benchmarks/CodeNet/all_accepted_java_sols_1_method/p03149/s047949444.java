import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isA = false, isB = false, isC = false, isD = false;
        int[] index = new int[4];
        for (int i = 0; i < 4; i++) {
            index[i] = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            int idx = index[i];
            if (idx == 1) {
                isA = true;
            } else if (idx == 9) {
                isB = true;
            } else if (idx == 7) {
                isC = true;
            } else if (idx == 4) {
                isD = true;
            }
        }
        System.out.println(isA && isB && isC && isD ? "YES" : "NO");
    }

}
