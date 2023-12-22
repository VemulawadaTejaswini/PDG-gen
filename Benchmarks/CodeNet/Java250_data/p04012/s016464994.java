import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> w_list = new ArrayList<String>();
        
        for(String c : sc.next().split("")){
            w_list.add(c);
        }
        
        Collections.sort(w_list);
        
        Map<String, Integer> ans = new HashMap<String, Integer>();
        for(int i=0; i<w_list.size(); i++){
            if(ans.get(w_list.get(i)) == null){
                ans.put(w_list.get(i), 1);
            }else{
                ans.put(w_list.get(i), ans.get(w_list.get(i)) + 1);
            }
        }
        
        for(int i=0; i<w_list.size(); i++){
            if(ans.get(w_list.get(i)) % 2 != 0){
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}