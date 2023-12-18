import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       long sum = 0;
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

    for(int i = 0; i < n; i++){
        int a = scan.nextInt();
             max = Math.max(max,a);
             min = Math.min(min,a);
             sum += a;
       
           }
System.out.println(min + " " + max + " " + sum);
    }
}
