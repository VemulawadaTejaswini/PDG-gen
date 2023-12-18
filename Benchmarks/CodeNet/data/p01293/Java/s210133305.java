import java.util.*;

@SuppressWarnings("unchecked")
class Main{
 
    void solve(){
        Scanner sc = new Scanner(System.in);
 
        while(true){
            char t = sc.next().charAt(0);
            if(t=='#') break;
 
            ArrayList[] list = new ArrayList[4];
            for(int i=0; i<4; i++) list[i] = new ArrayList<String>();
            
            char now = 'a';
            for(int i=0; i<4; i++){
                for(int j=0; j<13; j++){
                    String s = sc.next();
                    if(i==0 && j==0) now = s.charAt(1);
                    list[i].add(s);
                }
            }
 
            int[] point = new int[2];
            int turn = 0;
 
            for(int i=0; i<13; i++){
                String s = (String)list[turn].get(0);
                list[turn].remove(0);
                now = s.charAt(1);
                char maxC = now;
                char max = s.charAt(0);
                int maxidx = turn;
 
                for(int j=0; j<4; j++){
                    if(j==turn) continue;

                    for(int k=0; k<list[j].size(); k++){
                        String ss = (String)list[j].get(k);
                        if(ss.charAt(1)==now){
                            list[j].remove(k);                            
                            if(maxC==now && max(ss.charAt(0), max)){
                                max = ss.charAt(0);
                                maxidx = j;
                            }
                            break;
                        }
                    }

                    if(list[turn].size()!=list[j].size()){
                        String ss = (String)list[j].get(0);
                        list[j].remove(0);
                        if(ss.charAt(1)!=t) continue;
                        if(maxC!=t || (maxC==t && max(ss.charAt(0), max))){
                            max = ss.charAt(0);
                            maxidx = j;
                            maxC = t;
                        }
                    }
                }
                point[maxidx%2]++;
                turn = maxidx;
            }
 
            int ew = point[1] - 6;
            int ns = point[0] - 6;
            if(ew>ns) System.out.println("EW "+ew);
            else System.out.println("NS "+ns);
        }
    }
 
    boolean max(char c1, char c2){
        char[] list = {'2','3','4','5','6','7','8','9','T','J','Q','K','A'};
        int idx1 = 0, idx2 = 0;
        for(int i=0; i<list.length; i++){
            if(c1==list[i]) idx1 = i;
            if(c2==list[i]) idx2 = i;
        }
 
        if(idx1>idx2) return true;
        return false;
    }
 
    public static void main(String[] args){
        new Main().solve();
    }
}