import java.util.*; 

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int x,y;
        int t;
        int num;
        x = stdIn.nextInt();
        y = stdIn.nextInt();

        if(x>y){
            t=y;
            y=x;
            x=t;
        }

        num = x%y;
        while(num!=0){
            x = num;
            if(y>x){
                t=x;
                x=y;
                y=t;
            }
            if(x%y==0){
                break;
            }
            num = x%y;
        }
        System.out.println(y);
    }
}
