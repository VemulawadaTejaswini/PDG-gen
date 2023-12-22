import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            long n = Long.parseLong(sc.next());
            long m = Long.parseLong(sc.next());

            long allVote = 0;

            List<Integer> list = new ArrayList<>();
            
            for(int i = 0; i < n; i++){
                int vote = Integer.parseInt(sc.next());
                list.add(vote);
                allVote += vote;
            }

            Collections.sort(list);
            Collections.reverse(list);

            int judge = list.get((int)m - 1);

            if((double)judge < (double)allVote/(4*(double)m)) System.out.println("No");
            else System.out.println("Yes");

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}