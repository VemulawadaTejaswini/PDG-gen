import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(sc.next()));
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i < n; i++){
            sb.append(list.get((n-1)-i));
            if(i < n-1) sb.append(" ");
        }

        System.out.println(sb);
    }
}

