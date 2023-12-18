import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int counter = 0;
        for(int i = x; i <= y; i++){
            if(z % i == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}

