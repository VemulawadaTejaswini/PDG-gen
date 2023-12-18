import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] nums = new int[N][30];
        int[] total = new int[30];
        for(int i=0; i<N; i++) {
            long num = sc.nextLong();
            int count = 0;
            while(num>1) {
                int remain = (int) (num % 2);
                nums[i][count] = remain;
                num -= remain;
                num/=2;
                if(total[count]+remain==1) {
                    total[count]=1;
                }else {
                    total[count]=0;
                }
                count++;
            }
            nums[i][count] = 1;
            if(total[count]==1) {
                total[count]=0;
            }else {
                total[count]=1;
            }
        }

        for(int i=0; i<N; i++) {
            int answer = 0;
            for(int j=0; j<30; j++) {
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