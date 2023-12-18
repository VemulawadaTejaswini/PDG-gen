import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int buf = 0;
        int counter = 1;
        while ((buf = input.nextInt()) != 0) {
            System.out.println(String.format("Case %d: %d", counter++, buf));
        }
    }
}

