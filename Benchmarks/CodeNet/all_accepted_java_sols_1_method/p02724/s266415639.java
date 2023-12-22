import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int cnt =0;
        
        cnt += (x/500)*1000;
        x = x-(x/500)*500;

        cnt+= (x/5)*5;
        System.out.println(cnt);
    }
}
