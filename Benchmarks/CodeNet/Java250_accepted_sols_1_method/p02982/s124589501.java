import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),d = sc.nextInt();
        int[][] x = new int[n][d];
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<d;j++){
                x[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<n;i++){
            int j = i+1;
            while(j<n){
                int tmp = 0;
                for(int k = 0;k<d;k++){
                    tmp += (x[i][k]-x[j][k])*(x[i][k]-x[j][k]);
                }
                int l =1;
                while(l*l<=tmp){
                    if(l*l==tmp){
                        count ++;
                    }
                    l ++;
                }
                j++;
            }
        }
        System.out.println(count);
    }
}