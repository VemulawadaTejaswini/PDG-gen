import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        
        boolean flag = false;
        for(int i = 0; i <= x; i++){
            if(i*2 + (x-i)*4 == y){
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}