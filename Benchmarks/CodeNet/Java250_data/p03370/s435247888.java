import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int donuts[] = new int[n];
        int count = 0;
        for(int i = 0; i < n ; i++){
            donuts[i] = sc.nextInt();
        }
        Arrays.sort(donuts);
        for(int value : donuts){
            x -= value;
            count++;
        }
        while(x >= donuts[0]){
            x -= donuts[0];
            count++;
        }
        System.out.println(count);
    }
}
