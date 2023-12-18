import java.util.*;
public class Main{
		
  	public static void main(String args[]){
    	Scanner s=new Scanner(System.in);
      	int d=s.nextInt();
      	int t=s.nextInt();
      	int speed=s.nextInt();
      	float er=d/speed;
      	if(er<=t){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}