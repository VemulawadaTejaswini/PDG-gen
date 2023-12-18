import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String labelStr = scanner.nextLine();
        String orderStr = scanner.nextLine();
        
        String[] labelArr = labelStr.split(" ");
        int dice[] = new int[6];
        
        for (int i=0; i<6; i++) {
            dice[i] = Integer.parseInt(labelArr[i]);
        }
        
        DiceUtil diceUtil = new DiceUtil();
        diceUtil.setDice(dice[0],dice[1],dice[2],dice[3],dice[4],dice[5]);

        char[] orderArr = orderStr.toCharArray();
        for(char order : orderArr){
            diceUtil.orderDice(order);
        }
        
        System.out.println(diceUtil.getDiceTop());
    }
}

class DiceUtil {
    
    int dice[];
    
    DiceUtil() {
        dice = new int[6];
    }
    
    public void setDice(int num1, int num2, int num3, int num4, int num5, int num6){
        dice[0] = num1;
        dice[1] = num2;
        dice[2] = num3;
        dice[3] = num4;
        dice[4] = num5;
        dice[5] = num6;
    }
    
    public void orderDice(char order){
        int tmp = 0;
        switch(order){
            case 'N':
                tmp = dice[0];
                dice[0] = dice[1];
                dice[1] = dice[5];
                dice[5] = dice[4];
                dice[4] = tmp;
                break;
            case 'S':
                tmp = dice[0];
                dice[0] = dice[4];
                dice[4] = dice[5];
                dice[5] = dice[1];
                dice[1] = tmp;
                break;
            case 'E':
                tmp = dice[0];
                dice[0] = dice[3];
                dice[3] = dice[5];
                dice[5] = dice[2];
                dice[2] = tmp;
                break;
            case 'W':
                tmp = dice[0];
                dice[0] = dice[2];
                dice[2] = dice[5];
                dice[5] = dice[3];
                dice[3] = tmp;
                break;
        }
    }
    
    public int getDiceTop(){
        return dice[0];
    }
};
