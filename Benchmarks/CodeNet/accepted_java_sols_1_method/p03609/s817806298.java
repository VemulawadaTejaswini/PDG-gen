import java.util.*;

/**
 * Base_version with sc.close()
 */ 

class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int x = sc.nextInt();
      	int t = sc.nextInt();
      	sc.close();
        System.out.println(Math.max(x - t, 0));
    }
}
