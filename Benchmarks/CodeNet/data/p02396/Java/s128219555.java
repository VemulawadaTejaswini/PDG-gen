
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=0;
        boolean flag = true;
        while(flag){
            n++;
            int juge = Integer.parseInt(sc.next());
            if(juge != 0){
                System.out.println("Case " + n + ": " + juge);                
            }else{
                flag = false;
            }
        }
    }
}
