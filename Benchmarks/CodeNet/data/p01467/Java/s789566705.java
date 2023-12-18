import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a, b, k;
        int[] da = new int[12], db = new int[12], br = new int[12];
        a = in.nextInt();
        b = in.nextInt();
        k = in.nextInt();
        for(int i = 0; i < 10; i++){
            da[i] = a%10;
            db[i] = b%10;
            br[i] = 0;
            a /= 10; b /= 10;
        }
        int maxValue = 0;
        for(int i = 0; i < (1 << 9); i++){
            int nBit = 0;
            for(int j = i; j > 0; j /= 2) nBit += j % 2;
            if(nBit > k) continue;
            int mul = 1, value = 0;
            for(int j = 0; j < 9; j++, mul *= 10){
                br[j+1] = 0;
                value += (da[j] - db[j] - br[j]+ 10) % 10 * mul;
                if(da[j] - db[j] - br[j] < 0){
                    br[j+1] = 1;
                    if((i >> j) % 2 == 1){
                        br[j+1] = 0;
                    }
                }
            }
            if(value > maxValue){
                maxValue = value;
            }
        }
        System.out.println(maxValue);
    }
}