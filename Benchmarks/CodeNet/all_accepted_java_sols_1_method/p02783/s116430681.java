import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // System.out.println(input);
        String[] inputs = input.split(" ", 0);
        int hp = Integer.parseInt(inputs[0]);
        int attack = Integer.parseInt(inputs[1]);
        int count = 0;
        while(true){
            hp -= attack;
            count++;
            if(hp <= 0){
                break;
            }
        }
        System.out.println(count);
    }
}