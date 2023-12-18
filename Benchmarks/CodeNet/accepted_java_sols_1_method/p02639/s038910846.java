import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int i = 1;
      	while(sc.hasNextInt()){
        	if(sc.nextInt() == 0) System.out.println(i);
            i++;
        }
    }
}