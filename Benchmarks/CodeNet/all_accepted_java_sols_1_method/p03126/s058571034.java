import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int kind=scn.nextInt();
        int[][] search=new int[n][kind+1];
        for(int i=0;i<n;i++){
        Arrays.fill(search[i],0);
        }

        for(int i=0;i<n;i++){
            int k=scn.nextInt();
            for(int j=0;j<k;j++){
                int x=scn.nextInt();
                search[i][x]++;
            }
        }
        int cnt=0;
        for(int i=0;i<kind+1;i++){
            int flag=1;
            for(int j=0;j<n;j++){
                if(search[j][i]!=1) flag=0;
            }
            if(flag==1) cnt++;
        }
        System.out.println(cnt);
    }
}
