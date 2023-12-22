import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        int t = 0;
        while(true){
            A.add(sc.nextInt());
            B.add(sc.nextInt());
            if(A.get(A.size()-1) == 0) break;
            if(B.get(A.size()-1) == 0) break;
            t++;
        }
        for(int n=0;n<t;n++){
            for(int i=0; i < A.get(n); i++){
                for(int j=0; j < B.get(n); j++){
                    if(i==0 || i==A.get(n)-1) System.out.print("#");
                    else if(j==0) System.out.print("#");
                    else if(j==B.get(n)-1) System.out.print("#");
                    else{
                        System.out.print(".");
                    }
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
