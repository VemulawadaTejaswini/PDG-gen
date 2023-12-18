import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 問題数
        int m = sc.nextInt(); // 提出回数
        Map<Integer,String> result = new TreeMap<>();
        Map<Integer,Integer> failure = new TreeMap<>();
        int successSum = 0;
        
        for(int i=0; i<m; i++){
            int p = sc.nextInt();
            String s = sc.next();
            if(s.equals("WA") && result.get(p)==null){
                if(failure.containsKey(p)){ 
                    failure.put(p, failure.get(p)+1);
                }
                else{
                    failure.put(p, 1);
                }
            }
            else if(s.equals("WA") && result.get(p).equals("AC")){
                // no done
            }
            else if(s.equals("AC") && result.get(p)==null){
                result.put(p, "AC");
                successSum++;
            }
            else{
                // no done
            }
        }
        
        int failureSum = 0;
        for(int i : failure.keySet()){
            if(result.get(i) != null){
                failureSum += failure.get(i);
            }
        }
        
        System.out.println(successSum + " " + failureSum);
    }
}