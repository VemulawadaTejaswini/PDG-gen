import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();
        boolean[] b = new boolean[n];
        char[] cc = sc.next().toCharArray();
        for (int i = 0; i < n; i++) {
            b[i] = cc[i] == 'o';
        }
        int[] last = new int[k];
        int[] first = new int[k];

        int pos = n -1;
        int num = k;
        while(pos >= 0) {
            while(pos>=0 && !b[pos]) pos--;
            if(pos < 0) break;
            last[--num] = pos;
            if(num == 0) break;
            pos-=c+1;
        }

        num = 0;
        pos = 0;
        while(pos < n) {
            while(pos<n && !b[pos]) pos++;
            if(pos == n) break;
            first[num++] = pos;
            if(num == k) break;
            pos+=c+1;
        }

        for(int i=0; i<k; i++) {
            if(first[i] == last[i]) System.out.println(first[i]+1);
        }

    }



}