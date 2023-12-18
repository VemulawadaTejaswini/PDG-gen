import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<N;i++){
            list.add(sc.nextInt());
        }
        
        Collections.sort(list);
        
        //System.out.println(list.get(0));
        
        double value = list.get(0);
        
        for(int i=1;i<N;i++){
            value = (value + list.get(i))/2;
            //System.out.println(value);
        }
        
        System.out.println(value);
        
    }
}
