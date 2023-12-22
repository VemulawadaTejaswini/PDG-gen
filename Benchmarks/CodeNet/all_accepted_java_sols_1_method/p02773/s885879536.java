import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Map<String,Integer> map = new HashMap<String,Integer>();
        int max = 1;
        for(int i=0;i<N;i++){
            String temp = sc.next();
            if(map.containsKey(temp)){
                int value = map.get(temp) + 1;
                map.put(temp , value);
                if(value > max){
                    max = value;
                }

            }else{
                map.put(temp,1);
            }

        }
        List maxstr = new ArrayList<String>();
        for (String key: map.keySet()) {
            if(map.get(key) == max){
                maxstr.add(key);
            }
        }

        Collections.sort(maxstr);

        for(int i=0;i<maxstr.size();i++){
            System.out.println(maxstr.get(i));
        }

    }
}
