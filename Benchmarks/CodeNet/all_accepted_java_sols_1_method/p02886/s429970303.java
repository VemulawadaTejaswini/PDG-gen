import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int opt = 0;
        ArrayList<Integer> D = new ArrayList<>();
        for(int i=0;i<N;i++) D.add(sc.nextInt());
        for(int i=0;i<N-1;i++) for(int j=i+1;j<N;j++) opt+=D.get(i)*D.get(j);
        System.out.println(opt);
    }
}
