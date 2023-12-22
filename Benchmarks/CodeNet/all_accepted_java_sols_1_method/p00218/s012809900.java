import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == 0) break;
            for (int i = 0; i < n; i++) {
                String[] score = sc.nextLine().split(" ");
                int math = Integer.parseInt(score[0]);
                int english = Integer.parseInt(score[1]);
                int japanese = Integer.parseInt(score[2]);
                if (math == 100 || english == 100 || japanese == 100) {
                    System.out.println("A");
                } else if (math + english >= 180) {
                    System.out.println("A");
                } else if (math + english + japanese >= 240) {
                    System.out.println("A");
                } else if (math + english + japanese >= 210) {
                    System.out.println("B");
                } else if (math + english + japanese >= 150 && Math.max(math, english) >= 80) {
                    System.out.println("B");
                } else {
                    System.out.println("C");
                }
            }
        }
    }
}