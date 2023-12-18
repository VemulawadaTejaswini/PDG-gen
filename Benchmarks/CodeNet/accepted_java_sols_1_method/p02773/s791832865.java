
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author : gaurav.ss
 * @since : 16/02/20
 **/
 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        List<String> list= new ArrayList<>();
        Map<String, Integer> map= new HashMap<>();
        int max=0;
        for(int i=0;i<n;i++){
            String s=in.next();
            if(map.containsKey(s)){
                int v= map.get(s);
                v++;
                if(v>max){
                    max=v;
                }
                map.put(s, v);
            }else{
                map.put(s,1);
                if(1>max){
                    max=1;
                }
            }
        }
        for(Map.Entry<String, Integer> e: map.entrySet()){
            if(e.getValue()==max){
                list.add(e.getKey());
            }
        }
        Collections.sort(list);
        for(String s: list)
            System.out.println(s);

    }
}
