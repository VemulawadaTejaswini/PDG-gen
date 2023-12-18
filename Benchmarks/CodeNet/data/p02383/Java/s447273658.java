import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //入力
        int[] dice = new int[6];
        for(int i = 0; i < dice.length; i++){
            dice[i] = sc.nextInt();
        }
        
        //初期化
        int[] saveDice = new int[dice.length];
        for(int i : saveDice){
            saveDice[i] = 0;
        }
        DiceRoll dr = new DiceRoll(dice, saveDice);
        
        //命令
        String orderWriting = sc.next();
        char[] cutOffOrder = orderWriting.toCharArray();
        for(int i = 0; i < cutOffOrder.length; i++){
            if(cutOffOrder[i] == 'N') dr.rollNorthDice();   //Nが入力されたとき
            if(cutOffOrder[i] == 'S') dr.rollSouthDice();   //Sが入力されたとき
            if(cutOffOrder[i] == 'E') dr.rollEastDice();    //Eが入力されたとき
            if(cutOffOrder[i] == 'W') dr.rollWestDice();    //Wが入力されたとき
        }
        System.out.println(dr.rollOutput());
    }
}

class DiceRoll{
    int[] dice;
    int[] saveDice;
    public DiceRoll(int[] dice, int[] saveDice){
        this.saveDice = saveDice;
        this.dice = dice;
    }
    
    public void rollNorthDice(){
        saveDice[0] = dice[1];
        saveDice[1] = dice[5];
        saveDice[2] = dice[2];
        saveDice[3] = dice[3];
        saveDice[4] = dice[0];
        saveDice[5] = dice[4];
        replaceIndex(saveDice, dice);
    }
    
    public void rollSouthDice(){
        saveDice[0] = dice[4];
        saveDice[1] = dice[0];
        saveDice[2] = dice[2];
        saveDice[3] = dice[3];
        saveDice[4] = dice[5];
        saveDice[5] = dice[1];
        replaceIndex(saveDice, dice);
    }
    
    public void rollEastDice(){
        saveDice[0] = dice[3];
        saveDice[1] = dice[1];
        saveDice[2] = dice[0];
        saveDice[3] = dice[5];
        saveDice[4] = dice[4];
        saveDice[5] = dice[2];
        replaceIndex(saveDice, dice);
    }
    
    public void rollWestDice(){
        saveDice[0] = dice[2];
        saveDice[1] = dice[1];
        saveDice[2] = dice[5];
        saveDice[3] = dice[0];
        saveDice[4] = dice[4];
        saveDice[5] = dice[3];
        replaceIndex(saveDice, dice);
    }
    
    public int rollOutput(){
        return dice[0];
    }
    
    private void replaceIndex(int[] saveDice, int[] dice){
        for(int i = 0; i < saveDice.length; i++){
            dice[i] = saveDice[i];
        }
    }
}
