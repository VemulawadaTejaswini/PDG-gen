import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        double ans = 0;
        double x;
        String u;
        for(int i = 0; i < n; i++){
            x = Double.parseDouble(sc.next());
            u = sc.next();
            if(u.equals("JPY")){
                ans += x;
            }else{
                ans += x * 380000;
            }
        }
        
        System.out.println(ans);
    }
}