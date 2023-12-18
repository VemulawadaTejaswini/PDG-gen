import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        // TODO ?????????????????????????????????????????????
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        
        if(isSame(str1, str2)){
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
        
    }
    
    static boolean isSame(String str1, String str2){
        int[] a = new int[6];
        int[] b = new int[6];
 
        String[] tmpArray = str1.split(" ");
        for(int i = 0; i < 6; i++){
            a[i] = Integer.parseInt(tmpArray[i]);
        }
 
        tmpArray = str2.split(" ");
        for(int i = 0; i < 6; i++){
            b[i] = Integer.parseInt(tmpArray[i]);
        }
  
        Dice dice = new Dice(a);
//        Dice dice2 = new Dice(b);
        //?????????????????§???????????£?????????
        Dice[] dices = new Dice[24];
        for(int i = 0; i < dices.length ; i++){
        	dices[i] = new Dice(b);
        }

        //?????¢??¨??????
        String[] order = {"","L","LL","LLL","N","NL","NLL","NLLL","E","EL","ELL","ELLL","W","WL","WLL","WLLL","S","SL","SLL","SLLL","NN","NNL","NNLL","NNLLL"};
        
        for(int i = 0; i < order.length ; i++){
        	dices[i].executeCommands(order[i]);
        	if(dice.isSame(dices[i])){
//        		System.out.println("Yes");
        		return true;
        	}
        }
        
//        System.out.println("No");    	
        return false;
    }
 
}
 
class Dice {
    //??????????????????????\\??????????????????
    private int[] numbers = new int[6];// = {1,2,3,5,4,6};
    private int sum = 1;
 
    public Dice(int[] numbers){
        for(int i = 0; i < 6; i++){
            this.numbers[i] = numbers[i];
        }
        this.numbers[3] = numbers[4];
        this.numbers[4] = numbers[3];
    }
 
    public void executeCommands(String commands){
    	for(int i = 0; i < commands.length() ; i++){
    		char c = commands.charAt(i);
    		
    		if(c == 'N'){
    			north();
    		}
    		if(c == 'W'){
    			west();
    		}
    		if(c == 'S'){
    			south();
    		}
    		if(c == 'E'){
    			east();
    		}
    		if(c == 'L'){
    			left();
    		}
    		if(c == 'R'){
    			right();
    		}
    	}
    }
    
    public void move (String command){
        if(command.equals("North")) {
            north();
        }
 
        else if(command.equals("South")) {
            south();
        }
        else if(command.equals("East")) {
            east();
        }
        else if(command.equals("West")) {
            west();
        }
        else if(command.equals("Right")) {
            right();
        }
        else if(command.equals("Left")) {
            left();
        }
 
        sum += numbers[0];
    }
 
    public int getSum(){
        return sum;
    }
 
    private void north () {
        int[] tmp = numbers.clone();
        numbers[0] = tmp[1];
        numbers[1] = tmp[5];
        numbers[3] = tmp[0];
        numbers[5] = tmp[3];
    }
 
    private void east () {
        int[] tmp = numbers.clone();
        numbers[0] = tmp[4];
        numbers[2] = tmp[0];
        numbers[4] = tmp[5];
        numbers[5] = tmp[2];
    }
 
    private void west () {
        east(); east(); east();
    }
 
    private void south () {
        north(); north(); north();
    }
 
    private void right () {
        int[] tmp = numbers.clone();
        numbers[1] = tmp[2];
        numbers[2] = tmp[3];
        numbers[3] = tmp[4];
        numbers[4] = tmp[1];
    }
 
    private void left () {
        right(); right(); right();
    }
 
    public int top(){
        return numbers[0];
    }
 
    public int indexOf(int num){
        for(int i = 0; i < 6; i++){
            if(numbers[i] == num){
                return i;
            }
        }
 
        return -1;
    }
 
    public int number(int index){
        return numbers[index];
    }
    
    public boolean isSame(Dice d){
    	for(int i = 0; i < 6; i++){
    		if(d.number(i) != this.number(i)){
    			return false;
    		}
    	}
    	
    	return true;
    }
}