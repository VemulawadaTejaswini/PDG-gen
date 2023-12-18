import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        
        int temp = 0;
        
        List<Integer> list = new ArrayList<>();
        
        while(N!=0){
            list.add((int)N%26);
            N = N/26;
        }
        
        Collections.reverse(list);
        
        for(int i=0;i<list.size();i++){
            System.out.print((char)(int)(list.get(i)+96));
        }
    }
}
