import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long power = 1;
        for(int i = 1; i <= N; i++){
            power = (power * i) % (long)(Math.pow(10, 9) + 7);
        } 
        System.out.println(power);
	}

}
