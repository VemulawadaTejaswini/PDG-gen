import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		SimultaneousEquation();
	}
	
	public static void SimultaneousEquation(){
		Scanner scan = new Scanner(System.in);
		double[]eq = new double[6];
		
		while(scan.hasNext()){
			for(int i=0;i<6;i++)eq[i]=scan.nextDouble();
			double y =(eq[3]*eq[2]-eq[5]*eq[0])/ (eq[1]*eq[3]-eq[0]*eq[4]);
			double x = (eq[2]-y*eq[1])/eq[0];
            if(x == -0.0)
                x = 0.0;
            if(y == -0.0)
                y = 0.0;
			System.out.printf("%.3f %.3f", x,y);
		}
	}
}