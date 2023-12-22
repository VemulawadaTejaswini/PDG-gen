// writed 2020/03/25
// bit全探索
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        scanner.close();
        String[] numString = num.split("");
        int[] numInt = new int[4];
        for(int x=0;x<numString.length;x++) {
            numInt[x] = Integer.parseInt(numString[x]);
        }        
        int opnum = 3;

        for(int i=0;i<(1<<opnum);i++) {
            int sum = numInt[0];
            int count = 0;
            StringBuilder sb = new StringBuilder(num);
            for(int j=0;j<opnum;j++) {
                if((1&i>>j) == 1) {
                    sum += numInt[j+1];
                    sb.insert(j+1+count, "+");
                    count++;
                }else {
                    sum -= numInt[j+1];
                    sb.insert(j+1+count, "-");
                    count++;
                }
            }
            if(sum==7) {
                System.out.println(sb.toString() + "=7");
                return;
            }
        }
    }
}