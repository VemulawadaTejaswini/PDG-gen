import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i <= k; i++){
            for(int j = 0; j <= k; j++){
                if(0 <= s - i - j && k >= s - i - j) cnt++;
            }
        }
        System.out.println(cnt);
    }
}