import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        String[] A = scanner.nextLine().split(" ");
        String[] B = scanner.nextLine().split(" ");

        int n = s[0];
        int m = s[1];
        int k = s[2];

        int a_count = 0;
        int b_count = 0;

        for(int i = k; 0 <= i; i++ ){
            if(A[a_count].toInt() < B[b_count]){
                i = i - A[a_count].toInt();
                a_count += 1;
            }else{
                i = i - B[b_count].toInt();
                b_count += 1;
            }
        }
        System.out.println(a_count + b_count);
    }
}
