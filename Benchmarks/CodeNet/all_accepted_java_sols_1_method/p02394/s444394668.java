import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();
        
       if((x-r)<0){
           System.out.println("No");
       }else if((y-r)<0){
           System.out.println("No");
       }else if((x+r) > W){
           System.out.println("No");
       }else if((y+r) > H){
           System.out.println("No");
       }else{
           System.out.println("Yes");
       }
       
    }
}

