import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int dig = str.length();
        long in = Long.parseLong(str);
        long sum = 0;
        for(long i = 0; i < (1 << dig - 1); i++){
            long csum = 0;
            long c = in;
            for(int j = 0; j < dig - 1; j++){
                if((i >> j & 1) == 1){
                    csum += c / Math.round(Math.pow(10, dig - 1 - j));
                    c %= Math.round(Math.pow(10, dig - 1 - j));
                }
            }
            csum += c;
            sum += csum;
        }
        System.out.println(sum);
    }
}
