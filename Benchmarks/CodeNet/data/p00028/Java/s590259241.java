import java.util.*;
public class Main {
    public static void main(String[] args) {
        int max = 0;
        
        int[] num;
        num = new int[101];
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int n = input.nextInt();
            num[n]++;
            if (max < num[n]){
                max = num[n];
            }
        }
        for (int i = 1; i <= 100; i++){
            if (num[i] == max){
                System.out.println(i);
            }
        }
    }
}