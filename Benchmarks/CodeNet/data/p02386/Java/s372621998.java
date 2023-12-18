import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        Dice[] dice = new Dice[n];

        for(int i = 0; i < n; i++){
            String labelStr = scanner.nextLine();
            String[] labelArr = labelStr.split(" ");
            
            int[] tmpDice = new int[6];
            for (int j=0; j<6; j++) {
                tmpDice[j] = Integer.parseInt(labelArr[j]);
            }

            dice[i] = new Dice();
            dice[i].setDice(tmpDice[0],tmpDice[1],tmpDice[2],tmpDice[3],tmpDice[4],tmpDice[5]);
        }   
        
        boolean flg = false;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(dice[i].equals2(dice[j])){
                    flg = true;
                    break;
                }
            }
        }
        
        if(flg){
            System.out.println("No"); 
        } else {
            System.out.println("Yes"); 
        }
       

    }
}

class Dice {
    
    int dice[];
    
    Dice() {
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
            case 'R':
                tmp = dice[1];
                dice[1] = dice[3];
                dice[3] = dice[4];
                dice[4] = dice[2];
                dice[2] = tmp;
                break;
            case 'L':
                tmp = dice[1];
                dice[1] = dice[2];
                dice[2] = dice[4];
                dice[4] = dice[3];
                dice[3] = tmp;
                break;
        }
    }
    
    boolean equals(Dice dice){
        Dice tmpDice = dice;
        if(this.dice[0] == tmpDice.dice[0]){
            if(this.dice[5] == tmpDice.dice[5]){
                
                for(int i = 0; i < 4; i++){
                    if(this.dice[1] == tmpDice.dice[1] &&
                        this.dice[2] == tmpDice.dice[2] &&
                        this.dice[3] == tmpDice.dice[3] &&
                        this.dice[4] == tmpDice.dice[4]) return true;
                    tmpDice.orderDice('R');
                }
            }
        }
        return false;
    }
    
    boolean equals2(Dice dice){
        while(true){
            if(this.equals(dice)) {
                break;
            }
            dice.orderDice('N');
            if(this.equals(dice)) {
                break;
            }
            dice.orderDice('N');
            if(this.equals(dice)) {
                break;
            }
            dice.orderDice('N');
            if(this.equals(dice)) {
                break;
            }
            dice.orderDice('W');
            if(this.equals(dice)) {
                break;
            }
            dice.orderDice('E');
            dice.orderDice('E');
            if(this.equals(dice)) {
                break;
            }
            return false;
        }
        return true;
    }
};


