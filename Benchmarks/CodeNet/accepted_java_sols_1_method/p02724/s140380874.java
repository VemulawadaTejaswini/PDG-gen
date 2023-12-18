import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int B = X / 500;
        int S = (X - B * 500) / 5;
        System.out.print((B * 1000)  +  (S * 5)); 
	}

}