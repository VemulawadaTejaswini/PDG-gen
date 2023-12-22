import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] arsg){
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int d = sc.nextInt();
       int e = sc.nextInt();
       int k = sc.nextInt();
       int[] l = {a,b,c,d,e};
       String ans = "Yay!";
       out:
       for(int i = 0;i < l.length-1;i++){
           for(int x = 1;x < l.length;x++){
               if(Math.abs(l[i] - l[x]) > k){
                   ans = ":(";
                   break out;
               }
           }
       }
       System.out.println(ans);
    }
}