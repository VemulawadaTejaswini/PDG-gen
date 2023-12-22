import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(true) {
            String line;
            try {
                line = sc.nextLine();
            }catch(Exception e){
                break;
            }
            int d = Integer.parseInt(line);
            int n = 600 / d;
            int dsum = d;
            int sum = 0;
            for(int i = 1;i <= n; i++) {
                sum += d*Math.pow(dsum-d,2);
                dsum += d;
            }
            System.out.println(sum);
        }    
    }
}

