import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 0;

        int number = sc.nextInt();

        int member[] = new int[number];
        for (int i = 0; i < number; i++){
            member[i] = sc.nextInt();
            if (i == 0){
                min = member[i];
                max = member[i];
            }

            if (i != 0 && min > member[i]){
                min = member[i];
            }

            if (i != 0 && max < member[i]){
                max = member[i];
            }
        }

        System.out.println(Math.abs(max - min));
    }
}