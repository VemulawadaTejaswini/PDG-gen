import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer N = scan.nextInt();
        Long K = scan.nextLong();
        Integer Q = scan.nextInt();
        ArrayList<Integer> A = new ArrayList<Integer>();
        Integer array[] = new Integer[N];

        for(int i=0;i<Q;i++) A.add(scan.nextInt());

        for(int i=0;i<N;i++)
            array[i] = 0;

        for(int i=0;i<Q;i++){
            array[A.get(i)-1]++;
        }


        for(int i=0;i<N;i++){
            if(Q-K>=array[i])
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
