import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            int n = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.next());

            ArrayList<Integer> list = new ArrayList<>();

            for(int i = 0; i < k; i++){
                int d = Integer.parseInt(sc.next());
                for(int j = 0; j < d; j++){
                    int a = Integer.parseInt(sc.next());
                    if(!list.contains(a)){
                        list.add(a);
                    }
                }
            }

            System.out.println(n - list.size());

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}