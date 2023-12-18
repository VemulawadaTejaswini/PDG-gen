import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int turn=0;
        int[] x=new int[3];
        if(n==2){
            out.println("Borys");
        }else{
            while(true){
                x[0]=a-1;
                x[1]=b-1-a;
                x[2]=n-b;
                if(turn%2==0){
                    if(x[0]==0&&x[1]==0){
                        out.println("Borys");
                        break;
                    }else if(x[1]==0){
                        a--;
                    }else{
                        a++;
                    }
                }else{
                    if(x[1]==0&&x[2]==0){
                        out.println("Alice");
                        break;
                    }else if(x[1]==0){
                        b++;
                    }else{
                        b--;
                    }
                }
                turn++;
            }
        }
    }
}