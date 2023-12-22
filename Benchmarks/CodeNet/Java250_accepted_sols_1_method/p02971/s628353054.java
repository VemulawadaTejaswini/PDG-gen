import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        List<Integer> is = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            is.add(Integer.parseInt(s.nextLine()));
        }
        int m = Collections.max(is);
        int mi = is.indexOf(m);
        is.remove(is.indexOf(m));
        int m1 = Collections.max(is);
        for(int i=0;i<n;i++){
            if(i != mi){
                System.out.println(m);
                continue;
            }
            System.out.println(m1);
        }

    }
}