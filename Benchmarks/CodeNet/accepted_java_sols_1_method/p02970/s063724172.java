import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        int answer = n/(2*d+1);
        if((n%(2*d+1)) != 0){
            answer++;
        }
        System.out.println(answer);
    }
}