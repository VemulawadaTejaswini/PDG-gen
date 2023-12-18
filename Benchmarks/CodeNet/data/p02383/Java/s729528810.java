import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int i;
        int a[]=new int[6];
        for(i=0;i<6;i++)a[i]=sc.nextInt();
        Dice d=new Dice(a);
        String str=sc.next();
        for(i=0;i<str.length();i++)d.rollDice(str.charAt(i));
        System.out.println(d.getUp());
    }
}

class Dice{
    private int up;
    private int front;
    private int right;
    private int left;
    private int rear;
    private int down;
    Dice(int a[]){
        this.up=a[0];
        this.front=a[1];
        this.right=a[2];
        this.left=a[3];
        this.rear=a[4];
        this.down=a[5];
    }
    void rollDice(char d){
        int tmp=this.up;
        switch(d){
            case 'N':
                this.up=this.front;
                this.front=this.down;
                this.down=this.rear;
                this.rear=tmp;
                break;
            case 'E':
                this.up=this.left;
                this.left=this.down;
                this.down=this.right;
                this.right=tmp;
                break;
            case 'S':
                this.up=this.rear;
                this.rear=this.down;
                this.down=this.front;
                this.front=tmp;
                break;
            case 'W':
                this.up=this.right;
                this.right=this.down;
                this.down=this.left;
                this.left=tmp;
                break;
        }
    }
    int getUp(){
        return this.up;
    }
}
