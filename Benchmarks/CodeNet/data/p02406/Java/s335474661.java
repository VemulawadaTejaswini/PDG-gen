import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num;
        for(int i=1; i<= x; ++i){
            output(i);
        }

        System.out.printf("\n");

    }
    private static void output(int i){
        int k = 0;
        if((i % 3) == 0){
            System.out.printf(" %d", i);
        }
        else if((i % 10) == 3){
            System.out.printf(" %d", i);
        }
        else if( (i>10)&&(((i/10)%3)== 0) ||( ((i/10)%10) == 3)){
            System.out.printf(" %d", i);
        }
    }
}