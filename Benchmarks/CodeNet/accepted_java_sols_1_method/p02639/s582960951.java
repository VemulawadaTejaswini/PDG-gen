import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = 0;
        for(int i = 1 ; i <= 5 ; i++){
            int x = scanner.nextInt();
            if(x == 0){
                answer = i;
            }
        }
        System.out.println(answer);
    }
}