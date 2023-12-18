import java.util.Scanner;

public class at {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for(int i = 0; i < n; i++){
            long s = sc.nextInt();
            ans *= s;
        }
        if(ans >= 1.0e18){
            System.out.prinln(-1);
        }else {
        System.out.println(ans);}
        
        sc.close();
        
    }
}