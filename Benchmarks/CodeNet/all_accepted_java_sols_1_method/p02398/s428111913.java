import javax.swing.*;
import javax.swing.plaf.synth.SynthSpinnerUI;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int x = 0;
        for(int i = a ; i <= b  ; i++){
            if(c % i == 0){
                x++;
            }else{
                continue;
            }
        }
        System.out.println(x);
    }
}
