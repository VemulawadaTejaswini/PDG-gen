import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double X = sc.nextDouble();
		double max = 0;
		for(double b=1; Math.pow(b, 2)<=X; b++){
			for(double j=2; Math.pow(b, j) <= X; j++){
				max = Math.max(max, Math.pow(b, j));
				//System.out.print("\rb="+b+" j="+j);
				if(b==1)break;
			}
		}
		System.out.println((int)max);
	}	
}