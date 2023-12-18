import java.awt.*;
import java.io.*;
import java.net.StandardSocketOptions;
import java.util.*;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        new Main();
    }
    public Main(){
        new TestB().doIt();
    }
    class TestB{
        void doIt() {
            int N = sc.nextInt();
            int L[] = new int[N];
            for(int i = 0;i < N;i++){
                L[i] = sc.nextInt();
            }
            int cnt = 0;
            for(int i = 0;i < N;i++){
                for(int j = i+1;j < N;j++){
                    if(L[i] == L[j])continue;
                    for(int k = j+1;k < N;k++){
                        if(L[j] == L[k])continue;
                        if(L[i] == L[k])continue;
                        if(L[i] + L[j] > L[k] && L[j] + L[k] > L[i] && L[k] + L[i] > L[j])cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}