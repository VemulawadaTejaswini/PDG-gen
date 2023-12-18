import java.util.Scanner;
import javax.sound.midi.SysexMessage;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        for(;i<1000;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j =0;j<x;j++){
                for(int k=0;k<y;k++){
                    System.out.print("#");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
        
    }
}
