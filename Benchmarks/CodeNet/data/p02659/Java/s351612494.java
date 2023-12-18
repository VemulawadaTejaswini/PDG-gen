import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        if(0<=a && a<= Math.pow(10,15)){
            float c =a*b;
            System.out.println((long)c);
        }
    }
}