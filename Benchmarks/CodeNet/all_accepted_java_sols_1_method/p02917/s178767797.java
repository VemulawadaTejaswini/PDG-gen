import java.util.*;
public class Main {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Long> B = new ArrayList<>();
        for(int i=0;i<N-1;i++) B.add(sc.nextLong());
        long opt = 0;
        for(int i=0;i<N;i++){
            if(i==0) opt+=B.get(0);
            else if(i==N-1) opt+=B.get(N-2);
            else{
                long before = B.get(i-1);
                long next = B.get(i);
                if(before<next) opt+=before;
                else opt+=next;
            }
        }
        System.out.println(opt);
    }
}
