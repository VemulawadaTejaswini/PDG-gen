import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),x = 0,ans=0;
        sc.nextLine();
        String s = sc.nextLine();
        for(int i = 0; i < n; i++){
            if(s.charAt(i)=='I')x++;
            else x--;
            if(ans<x)ans=x;
        }
        System.out.println(ans);
        sc.close();
    }
}