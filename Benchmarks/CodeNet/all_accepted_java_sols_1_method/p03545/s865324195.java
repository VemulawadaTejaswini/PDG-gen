import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int[] a = new int[4];
        for(int i=0;i<4;i++){
            a[i] = s[i]-'0';
        }
        sc.close();
        int sum;
        int sign = 1;
        for(int i=0;i<8;i++){
            sign = 1;
            sum = 0;
            for(int j=0;j<3;j++){
                if(((i>>2-j)&1)==1){
                    sum+=sign*a[j];
                    sign = 1;
                }else{
                    sum+=sign*a[j];
                    sign = -1;
                }
            }
            sum+=a[3]*sign;
            if(sum==7){
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<3;j++){
                    sb.append(a[j]);
                    if(((i>>2-j)&1)==1){
                        sb.append('+');
                    }else{
                        sb.append('-');
                    }
                }
                sb.append(a[3]);
                sb.append("=7");
                System.out.println(sb.toString());
                return;
            }
        }
    }

}