import javax.swing.*;
import javax.swing.plaf.synth.SynthSpinnerUI;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        System.out.printf("%.10f %.10f",r*r*Math.PI,(2*r)*Math.PI);
    }
}
