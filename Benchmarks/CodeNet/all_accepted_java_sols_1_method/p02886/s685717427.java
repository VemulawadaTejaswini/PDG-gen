import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n,sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        
        while(list.size() > 0){
            for(int i = 1; i < list.size(); i++){
                sum += list.get(0) * list.get(i); 
            }
            list.remove(0);
        }
        
        System.out.println(sum);
        
    }
}