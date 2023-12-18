import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        for(int i = 1; i <= 5; i++){
            answer++;
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
        }
        System.out.println(answer);
    }

}
