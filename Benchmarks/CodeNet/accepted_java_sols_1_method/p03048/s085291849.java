import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
    static int r = sc.nextInt();
    static int g = sc.nextInt();
    static int b = sc.nextInt();
    static int n = sc.nextInt();


    public static void main(String[] args) {
        int ans = 0;
        for(int i = 0; i <= 3000; i++){
            for(int j = 0; j <= 3000; j++){
                int v = i*r + j*g;
                if(n >= v && (n-v)%b==0)ans++;
            }
        }  
        System.out.println(ans);     

    }


}
