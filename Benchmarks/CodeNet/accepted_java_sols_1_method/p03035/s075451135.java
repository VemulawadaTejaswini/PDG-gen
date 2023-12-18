import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int years = scan.nextInt();
      	int money = scan.nextInt();
      	if(years >= 13){
        	System.out.print(money);
        }
      else if(years >= 6){
      		System.out.print(money / 2);
      }
      else if(years >= 0){
      		System.out.print(0);
      }
    }

}