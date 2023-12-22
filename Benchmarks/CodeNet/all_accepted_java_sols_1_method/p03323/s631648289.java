import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int s = sc.nextInt();
        if((e <= 8) && (s <= 8)){
        	System.out.println("Yay!");
        }else{
        	System.out.println(":(");
        }
    }
}