import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Double> expect = new ArrayList<>();
        for(int i=0; i<N; i++){
            int val = scanner.nextInt();
            p.add(val);
            expect.add( (val + 1)/2.0 );
        }
        double maxexpect = 0;
        for(int i=0; i<K; i++){
            maxexpect += expect.get(i);
        }
        double sumexpect = maxexpect;
        for(int i=1; i<N-K+1; i++){
            sumexpect = sumexpect - expect.get(i-1) + expect.get(i+K-1);
            if(sumexpect > maxexpect){
                maxexpect = sumexpect;
            }
        }
        System.out.println(maxexpect);
    }
}