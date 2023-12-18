import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        while(true) {
            try {
                line = sc.nextLine();
            }catch(Exception e) {
                break;
            }
            double v = Double.parseDouble(line);
            double t = v / 9.8;
            double y = 4.9 * Math.pow(t, 2);
            double N = (y + 5)/5;
            int ans = (int)N;
            if(N % 1 == 0) {
                System.out.println(ans);
            }else {
                System.out.println(ans+1);
            }
        }
        
    }
}
