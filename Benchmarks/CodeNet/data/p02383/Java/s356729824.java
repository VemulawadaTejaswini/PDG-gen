import java.util.Scanner;

public class Main {
    private static int[] num;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        num = new int[6];

        for (int i = 0; i < 6; i++) {
            num[i] = scan.nextInt();
            System.out.print(num[i] + " ");
        }
        System.out.println();

        String direction = scan.next();
        char[] chars = direction.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            roll(num, chars[i]);
        }

        System.out.println();
        System.out.println(getTop());
    }

    private static void roll(int[] num, char direction) {
        switch (direction) {
            case 'N':
                num[0] = num[1];
                num[1] = num[5];
                num[5] = num[4];
                num[4] = num[0];
                break;
            case 'S':
                num[0] = num[4];
                num[4] = num[5];
                num[5] = num[1];
                num[1] = num[0];
                break;
            case 'W':
                num[0] = num[2];
                num[2] = num[5];
                num[5] = num[3];
                num[3] = num[0];
                break;
            case 'E':
                num[0] = num[3];
                num[3] = num[5];
                num[5] = num[2];
                num[2] = num[0];
                break;
        }
    }

    private static int getTop() {
        return num[0];
    }
}