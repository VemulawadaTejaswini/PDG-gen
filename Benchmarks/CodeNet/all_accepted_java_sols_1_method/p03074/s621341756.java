import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        String s = sc.next();
        
        int l = 0;
        int r = 0;
        for(int i = 0; i < k; i++){
            r = s.indexOf("0", r);
            r = s.indexOf("10", r);
            if(r == -1){
                r = n-1;
                break;
            }
        }
        
        int max = 0;
        while(true){
            if(r-l+1 > max){
                max = r-l+1;
            }
            if(r == n-1) break;
            
            r = s.indexOf("0", r);
            r = s.indexOf("10", r);
            if(r == -1){
                r = n-1;
            }
            l = s.indexOf("01", l) +1;
        }
        
        System.out.println(max);
    }
}