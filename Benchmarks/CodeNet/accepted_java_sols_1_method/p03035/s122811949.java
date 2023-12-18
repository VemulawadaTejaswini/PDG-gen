import java.util.*;


class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int result = 0;
        //a>=13を満たす時bを返す,満たさないときで、a>=6を満たすb/2,満たさないなら0
        System.out.println(result = (a >= 13) ? b : (a >= 6) ? b / 2 : 0);
    }
}