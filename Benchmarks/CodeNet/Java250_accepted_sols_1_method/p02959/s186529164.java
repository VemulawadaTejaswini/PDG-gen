import java.util.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for(int i= 0;i<N+1;i++){
            int a = scanner.nextInt();
            A.add(a);
        }
        List<Integer> B = new ArrayList<>();
        for(int i= 0;i<N;i++){
            int b = scanner.nextInt();
            B.add(b);
        }

        Map<List<Integer>, Integer> x = new HashMap<>();
        for(int i=0; i<N; i++){
            List<Integer> ii = new ArrayList<>(Arrays.asList(i, i));
            List<Integer> iminus1i = new ArrayList<>(Arrays.asList(i-1,i));
            List<Integer> iiplus1 = new ArrayList<>(Arrays.asList(i, i+1));
            if(i==0){
                x.put(ii, Math.min(A.get(i), B.get(i)));
            }else{
                x.put(ii, Math.min(A.get(i) - x.get(iminus1i), B.get(i)));
            }
            x.put(iiplus1, Math.min(B.get(i) - x.get(ii), A.get(i+1)));
        }
        long result = 0;
        for(Integer val: x.values()){
            result += val;
        }
        System.out.println(result);
    }
}