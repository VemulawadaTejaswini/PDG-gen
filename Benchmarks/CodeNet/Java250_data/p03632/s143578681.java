import java.util.*;
 
 
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        int ans = 0;
        int t[] = new int[101];
        for(int i=0; i<t.length; i++) t[i] = 0;
        for(int i=a; i<b; i++) t[i]++;
        for(int i=c; i<d; i++) t[i]++;
        for(int i=0; i<100; i++) {
            if(t[i] == 2){
                ans++;
            }
        }
        System.out.println(ans);
    }
}