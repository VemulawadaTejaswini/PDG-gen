import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] num = new int[11];
	int r = sc.nextInt();
	int D = sc.nextInt();
	int x = sc.nextInt();

	num[0] = x;
	
	if(2 <= r && r <= 5){
	    if(1 <= D && D <= 100 && D < x && x <= 200){
		for(int i = 0; i < 10; i++){
		    num[i+1] = r * num[i] - D;
		    System.out.println(num[i+1]);
		}
	    }
	}
    }
}

	
