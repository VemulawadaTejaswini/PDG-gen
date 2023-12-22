import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            int h = sc.nextInt();
            if(h >= k)
                sum += 1;
        }
        System.out.println(sum);
    }
}