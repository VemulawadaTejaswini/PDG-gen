import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int k = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        boolean flag = false;
        for(int i = 1; i <= 1000; i++){
            if(a <= k*i && k*i <= b){
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "OK" : "NG");    
    }
}