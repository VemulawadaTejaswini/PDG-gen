import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int panc[] = new int[n];
        for (int i = 0;i < n;++i){
            panc[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 1;i < n - 2;++i){
            while (panc[i] > 0&&panc[i + 1] > 0){
                int m = Math.min(panc[i],panc[i + 1]);
                c += m * 2;
                if(m == panc[i]){
                    panc[i] = 0;
                    panc[i + 1] -= m;
                }
                else{
                    panc[i + 1] = 0;
                    panc[i] -= m;
                }
            }
        }
        for (int i = 0;i < n;++i){
            while (panc[i] > 0){
                if(i == 0||i + 1 == n){
                    c += panc[i];
                    panc[i] = 0;
                }
                else{
                    c += panc[i] * 2;
                    panc[i] = 0;
                }
            }
        }
        System.out.println(c);
    }



}

