import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = i + 1; j<n; j++){
                count++;
            }
        }
        for(int i = 0; i<m; i++){
            for(int j = i + 1; j<m; j++){
                count++;
            }
        }
        System.out.println(count);
    }
}