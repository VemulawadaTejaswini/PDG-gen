import java.io.*;
import java.util.*;
class Main{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        int n = in.nextInt();
        int t[][] = new int[w][h];
        while(n-->0){
            int x = in.nextInt();
            int y = in.nextInt();

            int a = in.nextInt();
            switch(a){
                case 1: for(int i = 0;i< x;i++)
                    for(int j = 0; j< h; j++)t[i][j] = 1;
                    break;
                case 2:for(int i = x;i<w;i++)
                    for(int j = 0; j<h;j++)t[i][j] = 1;
                    break;
                    case 3:for(int i = 0; i < w;i++)
                    for(int j = 0 ;j<y;j++)t[i][j]  = 1;
                    break;
                case 4:for(int i = 0;i<w;i++)
                    for(int j = y;j<h;j++)t[i][j] = 1;
            }
        }
        int ret = 0;
        for(int i = 0;i<w;i++){
            for(int j = 0; j<h;j++){
                if(t[i][j] ==0)
                    ret++;
            }
        }
        System.out.println(ret);
    }
}