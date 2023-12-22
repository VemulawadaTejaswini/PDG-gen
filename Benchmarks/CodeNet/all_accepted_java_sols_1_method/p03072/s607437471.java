import java.util.Scanner;
class Main{
    public static void main(String[] arsg){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] l = new int[N];
        int ans = 0;
        int c = l[0];
        for(int i = 0;i < N;i++){
            l[i] = sc.nextInt();
        }
        
        for(int i = 0;i < N;i++){
            if(c <= l[i]){
                ans += 1;
                c = l[i];
            }
        }

       System.out.println(ans);
    }
}