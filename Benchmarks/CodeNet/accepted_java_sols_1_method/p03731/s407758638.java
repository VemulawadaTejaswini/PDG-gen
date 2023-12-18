//ｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｹｰｰｰｰｯ!!!wwwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwwｺｹｯwwwｺｹｯｺｯwwwｺｹｰｰｰｰｯ!!!wwwwwｺｹｯｺｯｯｺｰｰｰｰ!!!!!!wwwwwwwwwww
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = sc.nextInt();
        int[] t = new int[n];
        for(int i = 0 ; i < n ; i++){
            t[i] = sc.nextInt();
        }
        sc.close();
        int yono = T;
        for(int i = 0 ; i < n - 1 ; i++){
            if(t[i + 1] - t[i] < T){
                yono += t[i + 1] - t[i];
            }else{
                yono += T;
            }
        }
        System.out.println(yono);
    }
}