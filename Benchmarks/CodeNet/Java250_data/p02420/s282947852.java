import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        while(!(input.equals("-"))){
            int time = sc.nextInt();
            for(int i = 0; i < time; i++){
                int place = sc.nextInt();
                input = input.substring(place) + input.substring(0, place);

            }
            System.out.println(input);
            input = sc.next();
        }
        sc.close();
    }
}
