import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[] po=new boolean[N+1];
        int[] pena=new int[N+1];
        Arrays.fill(pena,0);
        for(int i=0; i<M; i++){
            int p=sc.nextInt();
            String s=sc.next();
            if(s.equals("WA")){
                if(!po[p]){
                    pena[p]++;
                }
                else{}
            }
            else if(s.equals("AC")){
                if(!po[p]){
                    po[p]=true;
                }
            }
        }
        int penasum=0;
        int ans=0;
        for(int i=0; i<=N; i++){
            if(po[i]) {
                ans++;
                penasum+=pena[i];
            }
        }

        System.out.println(ans+" "+penasum);
    }

}
