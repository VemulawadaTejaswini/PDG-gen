import java.awt.print.Printable;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;
  
public class Main{      
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();
        
            if(x==0&&y==0)
                break;

            for (int i = 0;i<x;i++) 
            {
                for (int j = 0;j<y;j++)
                {
                    if(i%2==0){
                        if(j%2==0)
                            System.out.print("#");
                        else
                            System.out.print(".");
                    }
                    else
                    {
                        if(j%2==0)
                            System.out.print(".");
                        else
                            System.out.print("#"); 
                    }
                }
                System.out.println();
            }
             
        }
        sc.close();
    }   
}
