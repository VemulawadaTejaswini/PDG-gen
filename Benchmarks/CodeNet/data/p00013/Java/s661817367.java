import java.util.*;

public class Main {
    
    int[] lst = new int[100];
    int point = 0;
        
    int fun(int n){
        if(n==0){
            point--;return lst[point+1];
        }
        point++;lst[point]=n;return 0;
    }
    
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        int n;
        while(sc.hasNext()){
            n=sc.nextInt();
            if(n==0){System.out.println(m.fun(n));continue;}
            m.fun(n);
        }
    }
}
