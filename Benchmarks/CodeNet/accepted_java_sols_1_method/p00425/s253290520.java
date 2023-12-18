import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice[] = {6,2,1,5,3,4};
        int num,i;
        int sum,tmp;
        String roll;

        while(sc.hasNext()){
        num = Integer.parseInt(sc.nextLine());
        if(num == 0) break;
        
        dice[0] = 6;
        dice[1] = 2;
        dice[2] = 1;
        dice[3] = 5;
        dice[4] = 3;
        dice[5] = 4;
        sum = dice[2];
        
        for(i = 0; i < num; i++){
            roll = sc.nextLine();
            if(roll.equals("North")){
                tmp = dice[2];
                dice[2] = dice[1];
                dice[1] = dice[0];
                dice[0] = dice[3];
                dice[3] = tmp;
            }else if(roll.equals("East")){
                tmp = dice[2];
                dice[2] = dice[5];
                dice[5] = dice[0];
                dice[0] = dice[4];
                dice[4] = tmp;
            }else if(roll.equals("West")){
                tmp = dice[2];
                dice[2] = dice[4];
                dice[4] = dice[0];
                dice[0] = dice[5];
                dice[5] = tmp;
            }else if(roll.equals("South")){
                tmp = dice[2];
                dice[2] = dice[3];
                dice[3] = dice[0];
                dice[0] = dice[1];
                dice[1] = tmp;
            }else if(roll.equals("Right")){
                tmp = dice[3];
                dice[3] = dice[5];
                dice[5] = dice[1];
                dice[1] = dice[4];
                dice[4] = tmp;
            }else if(roll.equals("Left")){
                tmp = dice[3];
                dice[3] = dice[4];
                dice[4] = dice[1];
                dice[1] = dice[5];
                dice[5] = tmp;
            }
            sum += dice[2];
        }
        
        System.out.println(sum);
        }        
    }
}