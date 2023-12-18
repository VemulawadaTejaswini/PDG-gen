import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> hmap = new HashMap<String,Integer>();
        
        int N = sc.nextInt();
        String[] S = new String[N];
        
        int max = 1;
        for(int i=0; i<N; i++){
            S[i] = sc.next();
            if(hmap.get(S[i]) == null){
                hmap.put(S[i],1);
            } else {
                int nextcount = hmap.get(S[i])+1;
                hmap.put(S[i],nextcount);
                if(nextcount > max) max = nextcount;
            }
        }

        ArrayList<String> maxS = new ArrayList<String>();

        for(String key : hmap.keySet()){
            if(hmap.get(key) == max) maxS.add(key);
        }

        Collections.sort(maxS);

        for(int i=0; i<maxS.size(); i++){
            System.out.println(maxS.get(i));
        }
    }
}