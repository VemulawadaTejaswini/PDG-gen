import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        int[][] data = new int[n][2];
        for (int i=0;i<n;i++){
            String s = sc.next();
            int count = 0;
            boolean b = true;
            for (int j=0;j<s.length();j++){
                if (!b)count++;
                if (s.charAt(j)!='.'){
                    a[i]=a[i]*10+s.charAt(j)-'0';
                }else {
                    b=false;
                }
            }
            while (count<9){
                a[i]*=10;
                count++;
            }
            long ins = a[i];
            while (ins%2==0){
                ins/=2;
                data[i][0]++;
            }
            ins = a[i];
            while (ins%5==0){
                ins/=5;
                data[i][1]++;
            }
        }
        int[][] table = new int[19][19];
        int baseAll = 0;
        int[] base2 = new int[19];
        int[] base5 = new int[19];
        for (int i=0;i<n;i++){
            if (data[i][0]>=18&&data[i][1]>=18)baseAll++;
            else if (data[i][0]>=18){
                for (int j=18-data[i][1];j<19;j++)base2[j]++;
            }
            else if (data[i][1]>=18){
                for (int j=18-data[i][0];j<19;j++)base5[j]++;
            }
            else {
                for (int j=18-data[i][0];j<19;j++){
                    for (int k=18-data[i][1];k<19;k++){
                        table[j][k]++;
                    }
                }
            }
        }
        int ans = 0;
        for (int i=0;i<n;i++){
            int pos2 = Math.min(data[i][0],18);
            int pos5 = Math.min(data[i][1],18);
            int def = baseAll+base2[pos5]+base5[pos2]+table[pos2][pos5];
            if (pos2>=9&&pos5>=9)def--;
            ans+=def;
        }
        System.out.println(ans/2);
    }
}
