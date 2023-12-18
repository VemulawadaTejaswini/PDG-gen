import static java.lang.Math.floor;
import static java.lang.Math.log;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    Scanner user_input = new Scanner(System.in);
    Scanner new_user = new Scanner(System.in);
    int x;
    int y;
    int p = 0;
    int w = 0;
    while(p<=200){
    x=user_input.nextInt();
    y=new_user.nextInt();
    p++;
    if(x>=0 && y>=0){
        int z=x+y;
            if(z==0){
                w=1;
            }else if(z>0 && z<10){
                w=1;
            }else{
                w = (int) (floor(log(z)/log(10))+1);   
            }
    }
    }
            System.out.println(w);
        
    }    
}