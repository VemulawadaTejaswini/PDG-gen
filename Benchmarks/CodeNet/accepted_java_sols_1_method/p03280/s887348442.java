import java.util.*;

class Main {

    public static void main(String[] atgs){

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ",0);

        System.out.println((Integer.parseInt(input[0]) - 1) * (Integer.parseInt(input[1]) - 1));
    }
}