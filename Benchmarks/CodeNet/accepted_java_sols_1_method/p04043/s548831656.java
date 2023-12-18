import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        Map<Integer, Integer> input = new HashMap<Integer, Integer>();
        
        int in = 0;
        int x = 0;
        
        for(int i = 0 ; i < 3 ; i++){
            in = scan.nextInt();
            if(input.get(in) != null){
                x = input.get(in);
                x = x + 1;
                input.put(in, x);
            }else{
                input.put(in, 1);
            }
        }
        
        int number5 = 0;
        int number7 = 0;
        String ans = "NO";
        
        number5 = input.get(5);
        if(number5 != 0){
            if(number5 == 2){
            number7 = input.get(7);
                if(number7 != 0){
                    if(number7 == 1){
                        ans = "YES";
                    }
                }
            }
        }
        
        System.out.println(ans);
        
    }
}