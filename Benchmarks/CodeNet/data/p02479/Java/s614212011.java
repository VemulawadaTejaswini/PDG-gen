import java.io.*;
import java.util.Scanner;
import static java.lang.Math.*;

class Test{
    public static void main(String args[]){
	//int r;//半径
	double menseki;//面積
	double syuu;//円周の長さ
	Scanner stdIn = new Scanner(System.in);
	int r = stdIn.nextInt();
	menseki = r*r*Math.PI;
	syuu = 2*Math.PI*r;
	System.out.print(""+menseki);
	System.out.println(" "+syuu);
    }
}