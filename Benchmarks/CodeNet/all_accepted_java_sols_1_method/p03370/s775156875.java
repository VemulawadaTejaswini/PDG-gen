import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        
        ArrayList<Integer> m = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            m.add(Integer.parseInt(sc.next()));
        }
        
        Collections.sort(m);
        
        int ans=0;
        for(int i=0; i<m.size(); i++){
            X -= m.get(i);
            ans++;
        }
        
        while(m.get(0) <= X){
            X -=m.get(0);
            ans++;
        }
        
        System.out.println(ans);
    }
}