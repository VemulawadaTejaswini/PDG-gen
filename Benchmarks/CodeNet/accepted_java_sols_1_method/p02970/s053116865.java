import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);
        int tree = scanner.nextInt();
        int patrol_width = scanner.nextInt();
      
        int max_patrol = patrol_width * 2 + 1;
      
        for(int i = 1; i <= 20; i++){
            if(tree <= max_patrol * i){
			    System.out.println(i);
                break;
            }
        }
    }
}