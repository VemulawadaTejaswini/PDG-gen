import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int even = 0;
        int four = 0;
        int odd = 0;
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
            if(a[i] % 4 == 0){
                four++;
            }else if(a[i] % 2 == 0){
                even++;
            }else if(a[i] % 2 == 1){
                odd++;
            }
        }
        //System.out.println(" even : " + even + " four : " + four + " odd : " + odd);
        if((four >= odd-1 && even == 0) || (four >= odd && even % 2 == 1) || (four == odd && even%2 == 0)){
            System.out.println("Yes");
            return;
        }else{
            System.out.println("No");
            return;
        }
    }
}