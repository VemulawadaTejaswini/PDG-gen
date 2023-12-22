//ｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｹｰｰｰｰｯ!!!wwwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwwｺｹｯwwwｺｹｯｺｯwwwｺｹｰｰｰｰｯ!!!wwwwwｺｹｯｺｯｯｺｰｰｰｰ!!!!!!wwwwwwwwwww
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ttt = sc.nextInt();
        int[] c = new int[n];
        int[] t = new int[n];
        for(int i = 0 ; i < n ; i++){
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();
            if(t[i] > ttt){
                c[i] = 2020;
            }
        }
        Arrays.sort(c);
        if(c[0] == 2020){
            System.out.println("TLE");
        }else{
            System.out.println(c[0]);
        }
    }
}