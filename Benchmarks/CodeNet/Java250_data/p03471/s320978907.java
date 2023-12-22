import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");

        int N = Integer.parseInt(line[0]);
        int Y = Integer.parseInt(line[1]);

        for(int x = 0;x <= N;x++){
            for(int y = 0;y <= N-x;y++){
                int z = N - x- y;

                if(z < 0){
                    continue;
                }
                
                int sum = 10000 * x + 5000 * y + 1000 * z;

                if(Y == sum){
                    System.out.println(x + " " + y + " " + z);
                    return;
                }
            }
        }

    System.out.println("-1 -1 -1");

    }
}
