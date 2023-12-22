import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] input = new int[n];

        for(int i=0;i<n;i++){
            input[i] = sc.nextInt();
        }

        int[] sorted = Arrays.copyOf(input,input.length);
        Arrays.sort(sorted);

        int count = 0;
        int[] different = new int[2];
        for(int i=0;i<n;i++){
            if(input[i] != sorted[i]){
                if(count ==2){
                    System.out.println("NO");
                    return;
                }
                different[count]=i;
                count++;
            }
        }

        if(count ==0){
            System.out.println("YES");
        }else if(count == 1){
            System.out.println("NO");
        }else{
            if(input[different[0]] == sorted[different[1]]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        }





    }
}