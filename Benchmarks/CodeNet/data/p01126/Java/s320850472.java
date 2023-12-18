import java.util.*;

public class Main {
    static Scanner s = new Scanner(System.in);

    static class AmidaSwitch implements Comparable<AmidaSwitch> {
        int h, p, q;

        @Override
        public int compareTo(AmidaSwitch o) {
            return -(this.h - o.h);
        }

        AmidaSwitch(int h, int p, int q) {
            this.h = h;
            this.p = p;
            this.q = q;
        }
    }

    public static void main(String[] args) {
        AmidaSwitch[] list;

        while (true) {
            int n = s.nextInt();
            int m = s.nextInt();
            int a = s.nextInt();

            if (n == 0 && m == 0 && a == 0) break;
            list = new AmidaSwitch[m];

            int[] amida = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                amida[i] = i;
            }

            for (int i = 0; i < m; i++) {
                int h = s.nextInt();
                int p = s.nextInt();
                int q = s.nextInt();
                list[i]= new AmidaSwitch(h,p,q);
            }

            Arrays.sort(list);

            for (int i = 0; i < list.length; i++) {
                AmidaSwitch tempAmida = list[i];

                int temp = amida[tempAmida.p];
                amida[tempAmida.p] = amida[tempAmida.q];
                amida[tempAmida.q] = temp;
            }

            int ans=0;
            for(int i=1;i<amida.length;i++){
                if(amida[i]==a){
                    ans=i;
                    break;
                }
            }
            System.out.println(ans);
        }
    }


}