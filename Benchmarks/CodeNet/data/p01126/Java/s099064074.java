import java.util.Scanner;
 
 
public class Main {
     
    public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);
         
        while(true){
             
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
             
            if(n == 0 && m == 0 && a == 0){
                break;
            }
             
            int h[] = new int[m];
            int p[] = new int[m];
            int q[] = new int[m];
            int max = 0;
             
            for(int i = 0; i < m; i++){
                h[i] = sc.nextInt();
                p[i] = sc.nextInt();
                q[i] = sc.nextInt();
                if(h[i] > max){
                    max = h[i];
                }
            }
             
            int map[][] = new int[n + 1][max + 1];
             
            for(int i = 0; i < n + 1; i++){
                for(int j = 0; j < max + 1; j++){
                    map[i][j] = 0;
                }
            }
             
            for(int i = 0; i < m; i++){
                map[p[i]][h[i]] = q[i];
                map[q[i]][h[i]] = p[i];
            }
             
            int nowLocate[][] = new int[1][2];
            nowLocate[0][1] = max;
            nowLocate[0][0] = a;
             
            while(true){
                 
                if(nowLocate[0][1] == 0){
                    break;
                }
                if(map[nowLocate[0][0]][nowLocate[0][1]] != 0){
                    nowLocate[0][0] = map[nowLocate[0][0]][nowLocate[0][1]];
                }
                nowLocate[0][1]--;
            }
             
            System.out.println(nowLocate[0][0]);
             
        }
         
    }
 
}