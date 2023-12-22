import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        ArrayList<String> ans = new ArrayList<String>();
        for(String c : s.split("")){
            if(c.equals("0")){
                ans.add("0");
            }
            if(c.equals("1")){
                ans.add("1");
            }
            if(c.equals("B") && ans.size() > 0){
                ans.remove(ans.size()-1);
            }
        }
        
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i));
        }
    }
}