import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> L = new ArrayList<>();
        int cnt = 0,tt=0;
        for(int i=0;i<n;i++){
            int s = sc.nextInt();
            int t = sc.nextInt();
            Time time = new Time();
            time.element(s,t);
            L.add(time);
        }
        Collections.sort(L, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                return o1.end<o2.end?-1:1;
            }
        });
        for(Time time:L){
            if(time.start>tt){
                tt = time.end;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static class Time{
        int start,end;
        public void element(int start,int end){
            this.start = start;
            this.end = end;
        }
    }
}
