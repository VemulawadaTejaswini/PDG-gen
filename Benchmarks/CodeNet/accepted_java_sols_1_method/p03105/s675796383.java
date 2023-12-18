import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int money = sc.nextInt();
        int satisfied = sc.nextInt();
        
        int satisfactionCounter = 0;
        while(money >= price){
        	money -= price;
            satisfactionCounter ++;
            if(satisfactionCounter == satisfied){
            	break;
            }
        }
        
        System.out.println(satisfactionCounter);
    }
}