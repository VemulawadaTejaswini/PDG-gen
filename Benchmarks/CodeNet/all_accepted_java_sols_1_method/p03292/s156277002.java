import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Integer[] num = {a,b,c};
        Arrays.sort(num,Collections.reverseOrder());

        System.out.println(Math.abs(num[1]-num[0]+num[2]-num[1]));
        
        
    }

}
