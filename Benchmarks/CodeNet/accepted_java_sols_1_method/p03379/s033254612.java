import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int n = Integer.parseInt(sc.next());
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> copyList = new ArrayList<>();
            for(int i = 0; i < n; i++){
                int add = Integer.parseInt(sc.next());
                list.add(add);
                copyList.add(add);
            }
            
            Collections.sort(copyList);
            int centerL = copyList.get(n/2 - 1);
            int centerR = copyList.get(n/2);

            for(int j = 0; j < list.size(); j++){
                if(centerL >= list.get(j)) System.out.println(centerR);
                else System.out.println(centerL);
            }

 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}