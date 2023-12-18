import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numValue = sc.nextInt();
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < numValue; i++){
            list.add(sc.nextInt());
        }
        
        List<Integer> sortList = new ArrayList<Integer>(list);
        
        for(int i = sortList.size()-1; i > 0; i--){
            System.out.print(list.get(i) + " ");
        }
        // List<Integer> reverseList = new ArrayList<Integer>(list);
        // Collections.reverse(reverseList);
        System.out.println(list.get(0));
    }
}
