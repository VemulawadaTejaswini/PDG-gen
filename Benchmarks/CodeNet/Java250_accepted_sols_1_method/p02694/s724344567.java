import java.util.*;

public class Main{
    public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
        long goal_depo = sc.nextLong();
      	long now_deposit = 100; 
      	long year = 0;
      
      	while(now_deposit < goal_depo)
        {
        	now_deposit += now_deposit / 100;
            year++;
        }
        System.out.println(year);
    }
}