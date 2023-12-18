import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int taro_score = 0;
        int hanako_score = 0;
        for(int i = 0; i < n; i++){
            String taro = sc.next();
            String hanako = sc.next();
            int judge = taro.compareTo(hanako);
            if(judge == 0){
                taro_score++;
                hanako_score++;
            }else if(judge < 0){
                hanako_score += 3;
            }else{
                taro_score += 3;
            }
        }
        System.out.println(taro_score + " " + hanako_score);
    }
}
