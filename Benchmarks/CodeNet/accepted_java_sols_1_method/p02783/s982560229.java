import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
      	int health = s.nextInt();
      	int attack = s.nextInt();
      	int numAttack = 0;
      	do{
        	health-=attack;
          	numAttack++;
        }while(health>0);
      	System.out.println(numAttack);
    }
}