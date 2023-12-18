import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int H = sc.nextInt();
        int[] slay_damages = new int[N];
        Integer[] throw_damages = new Integer[N];
        int slaydmg_max = 0;
        for(int i = 0; i < N; i++){
            slay_damages[i] = sc.nextInt();
            if(slaydmg_max < slay_damages[i]){
                slaydmg_max = slay_damages[i];
            }
            throw_damages[i] = sc.nextInt();
        }
        
        Arrays.sort(throw_damages, Collections.reverseOrder());
        
        int ans = 0;
        for(int i = 0; i < N; i++){
            if(slaydmg_max < throw_damages[i]){
                H -= throw_damages[i];
                ans++;
                if(H<=0){
                    break;
                }
            } else{
                break;
            }
        }
        
        if(H>0){
            ans += H%slaydmg_max==0 ? (int)(H/slaydmg_max) : (int)(H/slaydmg_max)+1;
        }
        
        
        System.out.println(ans);
    }
}
