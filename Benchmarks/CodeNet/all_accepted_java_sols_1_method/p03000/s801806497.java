import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int X = sc.nextInt();
        int opt=1;
        int len=0;
        ArrayList<Integer> L = new ArrayList<>();
        for(int i=0;i<N;i++){
            int l = sc.nextInt();
            len+=l;
            if(len<=X)opt++;
            else if(len>X)break;
        }
        System.out.println(opt);
    }
}
