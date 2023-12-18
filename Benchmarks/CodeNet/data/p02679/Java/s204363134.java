import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();

        Long[][] list = new Long[N][2];

        for (int i = 0; i < N; i++) {
            list[i][0] = sc.nextLong();
            list[i][1] = sc.nextLong();
        }

        int count = 0;

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++) {
                if (i == j) {count++; break;}
                if (list[i][0] > 0 && list[j][0] > 0 && list[i][1] > 0 && list[j][1] > 0 || 
                    list[i][0] < 0 && list[j][0] < 0 && list[i][1] < 0 && list[j][1] < 0 ||
                    list[i][0] < 0 && list[j][0] < 0 && list[i][1] > 0 && list[j][1] > 0 ||
                    list[i][0] > 0 && list[j][0] > 0 && list[i][1] < 0 && list[j][1] < 0 ){
                        count++;
                } else {
                    if (list[i][0] * list[j][0] + list[i][1] * list[j][1] != 0) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}