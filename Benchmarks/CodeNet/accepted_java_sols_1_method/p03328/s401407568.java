import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        //塔を生成
        int[] tower = new int[999];
        for(int i=0; i<999; i++) {
            if(i == 0) {
                tower[i] = i + 1;
            } else {
                tower[i] = tower[i-1] + i + 1;
            }
        }

        int index = b - a - 1;

        int answer = tower[index] - b;

        System.out.println(answer);
    }

}
