import java.util.Scanner;

class test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int many = 0;
            for (int m = 0; m < 10; m++) {
                for (int o = 0; o < 10; o++) {
                    for (int p = 0; p < 10; p++) {
                        for (int q = 0; q < 10; q++) {
                            if ((m + o + p + q) == n) {
                                many++;
                            }
                        }
                    }
                }
            }
            System.out.println(many);
        }

    }
}