import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int mod = 1000000000+7;
        int[][] a = new int[100005][13];
        char[] num = new char[100005];
        int index = str.length()-1;
        for(int i = 100005-1; i>=0; i--) {
            if(index>=0) {
                num[i] = str.charAt(index);
                index--;
            }else num[i] = '0';
        }
        index=0;

        a[index][0] = 1;
        index++;
        while(index<100005) {
            if(num[index]=='?') {
                //System.out.println(index);
                for(int k = 0; k<10; k++) {
                    for(int i = 0; i<13; i++) {
                        int now = i*10+k;
                        //System.out.println(now);
                        a[index][now%13] += (a[index-1][i])%mod;
                        a[index][now%13] = a[index][now%13]%mod;
                    }
                }
            }else {
                for(int i = 0; i<13; i++) {
                    int now = i*10+ Character.getNumericValue(num[index]);

                    if(index==1) {
//                        System.out.println(now);
//                        System.out.println("char " + num[index]);
//                        System.out.println("char to int: "+ Character.getNumericValue(num[index]));
                    }
                    a[index][now%13] += a[index-1][i]%mod;
                    a[index][now%13] = a[index][now%13]%mod;
                }
            }
            index++;
        }
        //System.out.println(index);
        System.out.println(a[100004][5]);
    }
}