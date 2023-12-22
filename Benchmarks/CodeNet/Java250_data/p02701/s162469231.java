import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[]str = new String[N];
        
        Set<String> set = new HashSet<String>();
        for(int i=0;i<N;i++){
            str[i]=sc.next();
            set.add(str[i]);
        }
            
        
        
        System.out.println(set.size());
    }
}