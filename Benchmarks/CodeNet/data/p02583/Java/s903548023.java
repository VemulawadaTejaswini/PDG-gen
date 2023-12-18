import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] l = new long[n];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            l[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(l);
        
        for(int i=0; i<n; i++) {
            if(list.contains(l[i])) {
                continue;
            }else {
            }
        }
        
        long ans = 0;
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                if(l[i]==l[j]) continue;
                for(int k=j+1; k<n; k++) {
                    if(l[i]==l[k] || l[j]==l[k]) continue;
                    if(l[i]+l[j]>l[k] && l[j]+l[k]>l[i] && l[k]+l[i]>l[j]) ans+=1;
                }
            }
        }
        System.out.println(ans);
    }
}