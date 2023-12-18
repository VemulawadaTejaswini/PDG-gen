import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 6;//dice face
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        Dice dice = new Dice(a);
        
        String order = sc.next();
        
        for(int i = 0; i < order.length(); i++){
            char c = order.charAt(i);
            switch(c){
                case 'S':
                    dice.turnS();
                    break;
                case 'N':
                    dice.turnN();
                    break;
                case 'W':
                    dice.turnW();
                    break;
                case 'E':
                    dice.turnE();
                    break;
            }
        }
        
        System.out.println(dice.top);
    }
}

class Dice{
    int top, front, right, left, back, bottom;

    Dice(int[] a){
        this.top = a[0];
        this.front = a[1];
        this.right = a[2];
        this.left = a[3];
        this.back = a[4];
        this.bottom = a[5];
    }
    
     void turnS(){
        int tmp = this.top;
        this.top = this.back;
        this.back = this.bottom;
        this.bottom = this.front;
        this.front = tmp;
    }

    void turnN(){
        int tmp = this.top;
        this.top = this.front;
        this.front = this.bottom;
        this.bottom = this.back;
        this.back = tmp;
    }

    void turnW(){
        int tmp = this.top;
        this.top = this.right;
        this.right = this.bottom;
        this.bottom = this.left;
        this.left = tmp;
    }

    void turnE(){
        int tmp = this.top;
        this.top = this.left;
        this.left = this.bottom;
        this.bottom = this.right;
        this.right = tmp;
    }
}
