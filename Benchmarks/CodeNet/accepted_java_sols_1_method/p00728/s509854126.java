import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] ave = new int[100];
            int count = 0;
            while(true){
                int max = 0, min = 1000, sum = 0;
                int n = sc.nextInt();
                if(n==0) break;

                for(int i=0;i<n;i++){
                    int input = sc.nextInt();
                    sum += input;
                    if(input > max) max = input;
                    if(input < min) min = input;
                }
                ave[count] = (sum - max - min)/(n-2);
                count ++;
            }
            for(int i=0; i<count; i++){
                System.out.println(ave[i]);
            }
        }
    }
}

