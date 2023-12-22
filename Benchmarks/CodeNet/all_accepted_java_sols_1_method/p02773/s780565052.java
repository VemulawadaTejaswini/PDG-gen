import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String,Integer> Num = new HashMap<>();
        for(int i=0;i<N;i++){
            String s = sc.next();
            if(Num.get(s)==null) Num.put(s,1);
            else Num.replace(s,Num.get(s)+1);
        }
        int max = Collections.max(Num.values());
        ArrayList<String> OPT = new ArrayList<>(Num.keySet());
        Collections.sort(OPT);
        for(String s:OPT) if(Num.get(s)==max) System.out.println(s);
    }
}