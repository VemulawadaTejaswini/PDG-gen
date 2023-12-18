import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int n=scan.nextInt();
        Dice dice[] =new Dice[n];
        int d[][]=new int[n][6];
        for(int i=0;i<n;i++){
            for(int j=0;j<6;j++){
                d[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<n;i++){
           dice[i]=new Dice(d[i][0],d[i][1],d[i][2],d[i][3],d[i][4],d[i][5]);
        }
        boolean result=false;
        outer:
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(dice[i].allcheck(dice[j])){
                    result=true;
                    break outer;
                }
            }
        }
        if(result){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}

class Dice{
    int top,bottom,left,right,front,back;

    Dice(int a, int b,int c,int d,int e,int f){
        top=a;
        front=b;
        right=c;
        left=d;
        back=e;
        bottom=f;
    }

    boolean allcheck(Dice e){
        Dice tmp =e;
        while(true){
            if(this.check(tmp)) break;
            tmp.turnN();
            if(this.check(tmp)) break;
            tmp.turnN();
            if(this.check(tmp)) break;
            tmp.turnN();
            if(this.check(tmp)) break;
            tmp.turnW();
            if(this.check(tmp)) break;
            tmp.turnE();  tmp.turnE();
            if(this.check(tmp)) break;

            return false;
        }
        return true;
    }

    boolean check(Dice e){
        Dice tmp = e;
        if(this.top == tmp.top){
            if(this.bottom == tmp.bottom){
                for(int i = 0; i < 4; i++){
                    if(this.checkSide(tmp)) return true;
                    tmp.turnR();
                }
            }
        }
        return false;
    }

    boolean checkSide(Dice e){
       return (this.front==e.front && this.back==e.back && this.left==e.left && this.right==e.right);
    }
    void settop(int a){
        if(a==right)turnW();
        else if(a==left)turnE();
        else if(a==back)turnS();
        else if(a==front)turnN();
        else if(a==bottom){
            turnN();
            turnN();
        }
    }
    void setfront(int a){
        if(a==right)turnL();
        else if(a==left)turnR();
        else if(a==back){
            turnL();
            turnL();
        }
    }
    void turnN(){
        int tmp=top;
        top=front;
        front=bottom;
        bottom=back;
        back=tmp;
    }
    void turnS(){
        int tmp=top;
        top=back;
        back=bottom;
        bottom=front;
        front=tmp;
    }
    void turnW(){
        int tmp=top;
        top=right;
        right=bottom;
        bottom=left;
        left=tmp;
    }
    void turnE(){
        int tmp=top;
        top=left;
        left=bottom;
        bottom=right;
        right=tmp;
    }
    void turnL(){
        int tmp=front;
        front=right;
        right=back;
        back=left;
        left=tmp;
    }
    void turnR(){
        int tmp=front;
        front=left;
        left=back;
        back=right;
        right=tmp;
    }
}

