import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");//number
        String order = br.readLine();
        int[] num = new int[line.length];
        for(int i=0;i<line.length;i++)
            num[i] = Integer.parseInt(line[i]); 
        Dice dice = new Dice();
        dice.setDice(num);//diceの目をinitialize
        System.out.println(dice.getNumber());
        for(int i=0;i<order.length();i++) 
            dice.diceRoll(String.valueOf(order.charAt(i)));
        System.out.println(dice.getNumber());
    }
}
class Dice {
    private int head;
    List<pip> list;
    public Dice(){
        list = new ArrayList<pip>();
        head = 1;
        for(int i=0;i<6;i++)
            list.add(new pip(i+1));
    }
    public int getHead() {
        return head;
    }
    public int getNumber() {
        return list.get(head-1).getNum();
    }
    public void setDice(int[] number) {
        //numberとlistsizeは同じ
        for(int i=0;i<list.size();i++) 
            list.get(i).setNum(number[i]);
    }
    public void diceRoll(String order) {
        if(order.equals("N")) {
            head = list.get(head-1).south;
        }else if(order.equals("E")) {
            
            head = list.get(head-1).west;
        }else if(order.equals("W")) {
            
            head = list.get(head-1).east;
        }else {
            head = list.get(head-1).north;
        }
    }
    class pip {
        private int label;
        private int number;
        public int north;
        public int south;
        public int east;
        public int west;
        public pip(int label) {
            this.label = label;
            switch(label) {
                case 1:this.north=5;this.south=2;this.east=3;this.west=4;
                    break;
                case 2:this.north=1;this.south=6;this.east=3;this.west=4;
                    break;
                case 3:this.north=1;this.south=6;this.east=5;this.west=2;
                    break;
                case 4:this.north=1;this.south=6;this.east=2;this.west=5;
                    break;
                case 5:this.north=1;this.south=6;this.east=3;this.west=4;
                    break;
                case 6:this.north=2;this.south=5;this.east=3;this.west=4;
                    break;
            }
        }
        public void setNum(int num){
            this.number = num;
        }
        public int getNum() {
            return this.number;
        }
    }
}