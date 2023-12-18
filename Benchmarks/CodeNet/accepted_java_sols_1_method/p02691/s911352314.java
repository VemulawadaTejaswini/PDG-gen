import java.util.*;

class Main{
    static int num = 200000;
    static int[] hoge = new int[num];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Long, Long> human = new HashMap<>();
        int[] a = new int[n+1];
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
            
        }

        Long count = 0L;
        for(int i=1;i<=n;i++){
            Long v = (long)a[i] + i;
            if(human.containsKey(v)){
                human.put(v, human.get(v)+1);
            }
            else{
                human.put(v, 1L);
            }
        }        
        for(int i=1;i<=n;i++){
            Long v = (long)i - a[i];
            if(human.containsKey(v)){
                count += human.get(v);
            }
        } 
        
        
        System.out.println(count);

    }
}
