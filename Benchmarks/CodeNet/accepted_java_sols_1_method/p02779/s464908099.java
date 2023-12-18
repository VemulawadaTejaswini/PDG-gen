import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        boolean hantei = false;
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0; i<N; i++){
            
            int x = scanner.nextInt();
            if(map.containsKey(x)){
                hantei = true;
            }else{
                map.put(x,1);
            }
            
        }
        
        if(hantei){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
        
    }
}
