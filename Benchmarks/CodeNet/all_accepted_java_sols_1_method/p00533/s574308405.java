import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,k,h,w,idx,flag;
        h = sc.nextInt();
        w = sc.nextInt();
        int[][] answer = new int[h][w];
        for(i = 0; i < h; i ++ ){
            char weather[] = sc.next().toCharArray(); 
            flag = 0;
            idx = 0;
            for(k = 0; k < weather.length; k ++ ){
                if(weather[k] == 'c'){
                    answer[i][k] = 0;
                    idx = k;
                    flag++;
                }
                if(flag == 0){
                    if(weather[k] == '.')answer[i][k] = -1;
                }
                else{
                    if(weather[k] == '.')answer[i][k] += k - idx;
                }
            }
        }
        for(i = 0; i < h; i ++ ){
            for(k = 0; k < w; k ++ ){
                if(k != w-1)System.out.print(answer[i][k]+" ");
                else System.out.println(answer[i][k]);
            }
        }
    }
}