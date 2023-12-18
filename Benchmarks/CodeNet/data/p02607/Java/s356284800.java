import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int []a = new int[n];
            int count = 0;
            for(int i = 0; i < n; i++){
                a[i] = input.nextInt();
                if((i%2 != 0 && a[i] % 2 !=0))
                    count++;
            }
        System.out.println(count);

    }
}
