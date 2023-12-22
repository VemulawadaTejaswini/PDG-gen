import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        if ((num / 100) == 1){
            num = num + 800;
        }else{
            num = num - 800;
        }
        if (((num / 10) % 10) == 1){
            num = num + 80;
        }else{
            num = num - 80;
        }
        if ((num % 10) == 1){
            num = num + 8;
        }else{
            num = num - 8;
        }
    
        System.out.println(num);

    }
}