import java.util.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String n_ = String.valueOf(n);
        String[] str = n_.split("");
        int l = str.length;
        int m = 0;
        for(int i=0;i<l;i++){
            if(Integer.parseInt(str[i])==1) m += 9*(Math.pow(10,l-i-1));
            else if(Integer.parseInt(str[i])==9) m += Math.pow(10,l-i-1);
        }
        System.out.println(m);
    }
}