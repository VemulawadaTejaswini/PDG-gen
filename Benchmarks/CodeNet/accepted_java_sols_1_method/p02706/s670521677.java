import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] input = line.split(" ", 0);

        int all = Integer.valueOf(input[0]).intValue();
        int a = Integer.valueOf(input[1]).intValue();

        line = sc.nextLine();
        input = line.split(" ", 0);

        for(int x = 0; x<a; x++){
            all -= Integer.valueOf(input[x]).intValue();
        }

        if(all >= 0) {
            System.out.println(all);
        }else{
            System.out.println(-1);
        }

    }
}