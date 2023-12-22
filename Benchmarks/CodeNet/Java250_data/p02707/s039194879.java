import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            int n = Integer.parseInt(sc.next());

            ArrayList<Integer> list = new ArrayList<>(n);

            for(int j = 0; j < n; j++)list.add(0);

            for(int i = 0; i < n - 1; i++){
                int joshi = Integer.parseInt(sc.next());
                list.set(joshi - 1, list.get(joshi - 1) + 1);
            }

            for(int k: list){
                System.out.println(k);
            }

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}