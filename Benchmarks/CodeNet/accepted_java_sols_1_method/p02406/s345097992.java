import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int f;
        int check;

        for(int i = 1; i <= x; i++){
            check = 0;
            if(i%3 == 0){
                System.out.print(" " + i);
                check = 1;
            }
            if(i%10 == 3 && check == 0){
                System.out.print(" " + i);
                check = 1;
            }

            f = i/10;
            String str = String.valueOf(f);
            if(str.contains("3") && check == 0){
                System.out.print(" " + i);
            }

        }

        System.out.print("\n");
    }
}


