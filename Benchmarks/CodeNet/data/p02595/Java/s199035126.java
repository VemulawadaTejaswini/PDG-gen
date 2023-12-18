import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int p=0; p<n; p++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Double.parseDouble(String.valueOf(a));
            Double.parseDouble(String.valueOf(b));
            Math.pow(a, 2);
            Math.pow(b, 2);
            double c = Math.sqrt(a + b);
            Math.round(c);
            if(c == k){
                counter++;
            }
        }
        System.out.println(counter);
    }
}