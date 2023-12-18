import java.util.Scanner;

public class Main {
    Main(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int tmp, case_num = 1;

        while((tmp = sc.nextInt()) != 0){
            System.out.printf("Case %d: %d\n", case_num++, tmp);
        }
    }

    public static void main(String[] args){
        new Main();
    }
}

