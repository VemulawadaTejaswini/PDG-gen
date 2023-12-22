import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i=1;i<n+1;i++){
            if (Integer.toString(i).length()%2==1){
                count++;
            }
        }
        System.out.println(count);
    }
}