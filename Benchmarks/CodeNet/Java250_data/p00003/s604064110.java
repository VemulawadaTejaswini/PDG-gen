import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] data = new int[3];
        while (scan.hasNext()) {
            int n=scan.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    data[j] = scan.nextInt();
                }
                for (int j = 0; j < 2; j++) {
                    for (int k = j + 1; k < 3; k++) {
                        if (data[j] < data[k]) {
                            int tmp;
                            tmp = data[j];
                            data[j] = data[k];
                            data[k] = tmp;
                        }
                    }
                }
                if (data[0] * data[0] == data[1] * data[1] + data[2] * data[2])
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}