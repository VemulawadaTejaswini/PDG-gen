import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int N = sc.nextInt();
        int i = 0;
        int j = 0;
        while( i < N) {
        	map.put(sc.nextInt(),i + 1);
        	i++;
        }
        while ( j < N) {
        	System.out.print(map.get(j+1) + " ");
        	j++;
        }

    }
}
