import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        double sum = 0;
        double a = 0;
        double b = 0;
        int res = 0;
        for(int i = 0; i< n; i++){
            a = Double.parseDouble(sc.next());
            b = Double.parseDouble(sc.next());
            sum = Math.sqrt(a * a + b * b);
            if(k >= sum){
                res++;
            }
        }
        
        System.out.println(res);
    
    }
}
