import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] s = sc.next().split("");
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0; i<s.length; i++){
            if(map.get(s[i]) != null){
                System.out.println("no");
                return;
            }else{
                map.put(s[i], 0);
            }
        }
        
        System.out.println("yes");
    }
}