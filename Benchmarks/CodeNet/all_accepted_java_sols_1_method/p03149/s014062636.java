import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;

public class Main {
    public Main(){
        Scanner sc=new Scanner(System.in);
        int N[]=new int[4];
        for(int i=0;i<4;i++){
            N[i]=sc.nextInt();
        }
        int[] ans=new int[]{1,7,9,4};
        boolean[] frag=new boolean[]{false,false,false,false};
        loop1:
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(ans[i]==N[j]){
                    continue loop1;
                }
            }
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
    public static void main(String[] args){
        Main main=new Main();
    }

}
