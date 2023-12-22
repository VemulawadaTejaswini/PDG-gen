import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> OPT = new ArrayList<>();
        int sum =0;
        int S = 0;
        for(int i=1;i<=N;i++){
            int num = sc.nextInt();
            List.add(num);
            if(i%2==0) sum+=num;
            S+=num;
        }
        OPT.add(S-2*sum);
        for(int i=0;i<N-1;i++) OPT.add(2*List.get(i)-OPT.get(i));
        for(int i=0;i<OPT.size();i++){
            System.out.print(OPT.get(i));
            if(i!=OPT.size()-1) System.out.print(" ");
        }
    }
}
