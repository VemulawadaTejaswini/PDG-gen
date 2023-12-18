import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        
        int max = Math.max(x,y);
        int min = Math.min(x,y);
        
        while(min > 0){
            int r = max % min;
            max = min;
            min = r;
        }
        System.out.println(max);
    }

}

