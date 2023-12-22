import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int i, limit;
     	int[] distance = new int[5];
      	for(i = 0; i < 5; i++) distance[i] = Integer.parseInt(sc.next());
      	limit = Integer.parseInt(sc.next());
      	if(distance[4] - distance[0] > limit) System.out.println(":(");
      	else System.out.println("Yay!");
    }
}
