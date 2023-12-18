import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h;
        int[] n = new int[3];
        n[0] = scan.nextInt();
        n[1] = scan.nextInt();
        n[2] = scan.nextInt();
        for(int i = 0;i < 2;i++) {
                for(int j = i + 1;j < 3;j++) {
                        if(n[i] > n[j]) {
                                h = n[i];
                                n[i] = n[j];
                                n[j] = h;
                        }
                }
        }
        System.out.println(n[0] + " " + n[1] + " " + n[2]);
    }
}