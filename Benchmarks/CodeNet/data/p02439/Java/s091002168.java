import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min,max;
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        
        min = Math.min(a,b);
        max = Math.max(a,b);
        min = Math.min(c,min);
        max = Math.max(c,max);
        
        System.out.println(String.format("%d %d",min,max));
    }

}

