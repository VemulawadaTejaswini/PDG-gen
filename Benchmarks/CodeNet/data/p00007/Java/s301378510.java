import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int answer = 100000;
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            answer *= 1.05;
            if(answer % 1000 == 0){continue;}
            answer += 1000 - (answer % 1000);
        }

        System.out.println(answer);


    }
}