import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        Set<Integer> doubles = new HashSet<>();
        Set<Integer> nocnt = new HashSet<>();
        Set<Integer> avails = new HashSet<>();
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
            if(doubles.contains(A[i])){nocnt.add(A[i]);}
            doubles.add(A[i]);
        }
        //gen(A);
        Arrays.sort(A);
        int sum=0;
        for(int i=0;i<N;i++){
            if(avails.contains(A[i])){continue;}
            else{
                int now = A[i];
                while(now <= 1000000){
                    avails.add(now);
                    now += A[i];
                }
                if(!nocnt.contains(A[i]))
                    sum++;
            }
        }
        System.out.println(sum);
    }
    private static void showArr(int[] a){
        for(int p:a){
            System.out.print(p + " ");
        }
        System.out.println();
    }
    private static void gen(int[] A){
        for(int i=0;i<A.length;i++){
            A[i] = new Random().nextInt(500000)+500000;
        }
    }

}
