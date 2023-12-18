import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] l = new int[3];
        for(int i = 0;i<3;i++){
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        System.out.println(l[0]+l[1]+l[2]*10);
        sc.close();
    }
}