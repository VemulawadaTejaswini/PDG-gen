import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String , Integer> M = new HashMap<>();
        int MaxS = -8000;
        String strMaxL = "";
        int MaxI = -1;
        String strMax = "";
        
        while(sc.hasNext()){
            String str = sc.next();
            /*
            if(Max < str.length){
                Max = str.length;
                strMax = str;
            }
            */
            
            if(M.get(str) == null){
                M.put(str,0);
            }else{
                M.put(str,M.get(str) + 1);
            }
        }
        
        for(Map.Entry<String,Integer> m : M.entrySet()){
            if(m.getKey().length() > MaxS){
                MaxS = m.getKey().length();
                strMaxL = m.getKey();
            }
            if(MaxI < m.getValue()){
                MaxI = m.getValue();
                strMax = m.getKey();
            }
        }
        System.out.println(strMax + " " + strMaxL);
    }
}
