import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<String> list = new ArrayList<>();
        for(int i =1; i<=N;i++){
            list.add(String.valueOf(i));
        }
        for(int i =0; i<M;i++){
            String A = sc.next();
            String B = sc.next();
            if(list.contains(A)){
               list.remove(list.indexOf(A));
            }
            if(list.contains(B)){
                list.remove(list.indexOf(B));
            }
        }
        sc.close();

        System.out.println(list.size());
    }
}
