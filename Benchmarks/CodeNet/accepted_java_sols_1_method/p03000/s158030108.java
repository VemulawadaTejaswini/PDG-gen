import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        int l[] = new int[n];

        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        int index = 0;
        int state = 0;
        int count = 0;

        while (index < n && state <= x) {
            count++;
            state = state + l[index];
            index++;
        }

        if (state <= x) {
            count++;
        }

        System.out.println(count);
	}
}
