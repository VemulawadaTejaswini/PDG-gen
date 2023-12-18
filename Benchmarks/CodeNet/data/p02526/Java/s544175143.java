import java.util.*;
import java.io.*;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int listS = sc.nextInt();
        int[] s = new int[listS];
        for(int i=0;i<listS;i++){
            s[i]=sc.nextInt();
        }
        int listT = sc.nextInt();
        int[] t = new int[listT];
        for(int i=0;i<listT;i++){
            t[i]=sc.nextInt();
        }
        Arrays.sort(s);
        int num = 0;
        for(int i=0;i<listT-1;i++){
            if(Arrays.binarySearch(s,t[i])>=0){num++;}
        }
        System.out.println(num);
    }
}