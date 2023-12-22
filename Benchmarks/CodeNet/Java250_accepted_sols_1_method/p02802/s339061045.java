import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map <Integer,String> map = new HashMap<>();
        int ans = 0;
        int [] count =  new int [N] ;
        
        
        for(int i=0; i<M; i++){
            int num = sc.nextInt()-1;
            String tmp = sc.next();
            if(tmp.equals("AC") ){
                if(!map.containsKey(num) || map.get(num).equals("WA")){
                    ans++;
                    map.put(num,tmp);
                }
            }else{
                if(!map.containsKey(num) || map.get(num).equals("WA")){
                    count[num]++;
                    map.put(num,tmp);
                }
            }
        }
        
        int sum = 0;
        for(int i=0; i<N; i++){
            if(map.containsKey(i) && map.get(i).equals("AC")){
                sum += count[i];
            }
        }
        
        System.out.print(ans+" ");
        System.out.println(sum);
    }
}
