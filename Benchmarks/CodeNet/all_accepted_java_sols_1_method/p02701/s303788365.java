import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            int n = Integer.parseInt(sc.next());
            Map<String, Integer> mapG = new HashMap<String, Integer>();

            for(int i = 0; i < n; i++){
                String keihin = sc.next();
                if(mapG.containsKey(keihin)){
                    mapG.put(keihin, mapG.get(keihin) + 1);
                }else{
                    mapG.put(keihin, 1);
                }
            }

            System.out.println(mapG.size());

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}