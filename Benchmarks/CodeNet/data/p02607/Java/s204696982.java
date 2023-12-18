import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ary = new int[n];

        int count = 0;
        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            if(temp%2==1 && i%2==0){
                count++;
            }
        }

        System.out.println(count);
    }
}