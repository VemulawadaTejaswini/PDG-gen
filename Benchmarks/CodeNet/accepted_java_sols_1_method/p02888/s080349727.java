import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] l = new Integer[n];
        for(int i=0; i<n; i++) {
            l[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(l,Comparator.reverseOrder());

        //l[i] >= l[j] >= l[k]
        int cnt = 0;
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    if(l[j]-l[k]<l[i] && l[i]<l[j]+l[k]) cnt++;
                    else break;
                }
            }
        }
        System.out.println(cnt);
    }
}