import java.util.Scanner;
public class Main {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int wnum = 0;
         int rnum = 0;
         int ans = 0;
         char[] C = new char[N];
         String text = sc.next();
         for(int i = 0 ; i < N ; i++){
                C[i] = text.charAt(i);
                if(C[i] == 'W'){
                    wnum++;
                }else{
                    rnum++;
                }
         }
         if(wnum == 0||rnum == 0){
         }else{    
            for(int i = N - 1 - wnum ; i < N ; i++){
                if(C[i] == 'R'){
                    ans++;
                }
            }
         }
         System.out.println(ans);
    }
}
