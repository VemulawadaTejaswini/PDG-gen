import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int i = 1;

        while(true){
            if(x != 0){
                System.out.println("Case "+i+":"+x);
                i++;
                x = sc.nextInt();
            }else{
                break;
            }
        }

        sc.close();
    }
}
