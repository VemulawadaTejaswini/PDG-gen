
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] L = new int[n];
        for(int i=0;i<n;i++){
            L[i] = sc.nextInt();
        }
        Arrays.sort(L);
//        for(int i=0;i<L.length;i++){
//            System.out.print(" "+L[i]);
//        }
        int count = 0;
        for(int i=0;i<n-2;i++){
           for(int j=i+1;j<n-1;j++){
               if(L[i]==L[j]){
                   continue;
               }
               for(int k=j+1;k<n;k++){
                   if(L[j]==L[k]){
                       continue;
                   }
                   if(checkTriangle(L[i],L[j],L[k])){
                       count++;
                   }
               }
           }
        }
        System.out.println(count);
    }
    static boolean checkTriangle(int a,int b,int c){
        return Math.abs(b-a) < c && c < a+b;
    }
}