import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] nums = new int[N][31];
        int[] total = new int[31];
        for(int i=0; i<N; i++) {
            long num = sc.nextLong();
            int count = 0;
            while(num>1) {
                int remain = (int) (num % 2);
                nums[i][count] = remain;
                num -= remain;
                num/=2;
                if(total[count]==remain) {
                    total[count]=0;
                }else {
                    total[count]=1;
                }
                count++;
            }
            if(num==0) {
                nums[i][count]=0;
            }else {
                nums[i][count] = 1;
            }
            if(total[count]==nums[i][count]) {
                total[count]=0;
            }else {
                total[count]=1;
            }
        }

        for(int i=0; i<N; i++) {
            int answer = 0;
            for(int j=0; j<31; j++) {
                if(nums[i][j]!=total[j]) {
                    answer+=Math.pow(2, j);
                }
            }
            if(i==0) {
                System.out.print(answer);
            }else {
                System.out.print(" " + answer);
            }
        }
    }
}
