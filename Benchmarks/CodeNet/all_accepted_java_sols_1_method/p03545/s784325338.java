import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        sc.close();
        int[] each_dig = new int[4];
        for(int i = 0; i < 4; i++){
            each_dig[i] = in % 10;
            in /= 10;
        }
        char[] oprs = new char[3];
        for(int i = 0; i < 8; i++){
            int sum = each_dig[3];
            for(int j = 0; j < 3; j++){
                if((i >> j & 1) == 1){
                    sum += each_dig[2 - j];
                }else{
                    sum -= each_dig[2 - j];
                }
            }
            if(sum == 7){
                for(int j = 0; j < 3; j++){
                    if((i >> j & 1) == 1){
                        oprs[j] = '+';
                    }else{
                        oprs[j] = '-';
                    }
                }
                break;
            }
        }
        System.out.println("" + each_dig[3] + oprs[0] + each_dig[2] + oprs[1] + each_dig[1] + oprs[2] + each_dig[0] + "=7");
    }
}