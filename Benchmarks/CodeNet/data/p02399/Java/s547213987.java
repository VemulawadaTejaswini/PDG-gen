import javax.swing.*;
import javax.swing.plaf.synth.SynthSpinnerUI;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		System.out.print((int)a/b+" ");
		System.out.print((int)a%b+" ");
		System.out.print(String.format("%.5f", (double)a/b));
	}
}
