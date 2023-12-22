import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first_num = sc.nextInt();
        int second_num = sc.nextInt();
        for(int i = 1;i < 2000 ;i++){
            if(Math.floor(i*0.08) == first_num && Math.floor(i*0.1) == second_num){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}