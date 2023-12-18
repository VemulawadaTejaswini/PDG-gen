import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>(n);
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(sc.next()));
        }
        
        int q = Integer.parseInt(sc.next());
        int start,end,search,count;
        
        for(int i=0; i<q; i++){
            start = Integer.parseInt(sc.next());
            end = Integer.parseInt(sc.next());
            search = Integer.parseInt(sc.next());
            count=0;
            for(int j=start; j<end; j++){
                if(list.get(j) == search) count++;
            }
            System.out.println(count);
        }
    }
}


