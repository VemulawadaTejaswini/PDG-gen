import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int dis = scanner.nextInt();
        int time = scanner.nextInt();
        int speed = scanner.nextInt();
        
        if(dis<=time*speed){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}