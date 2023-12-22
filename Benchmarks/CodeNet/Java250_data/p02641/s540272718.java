import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int res = 0;
        if(n == 0){
            System.out.println(x);
            System.exit(0);
        }

        List<Integer> array = new ArrayList<>();
        for(int i = 0; i < n; i++){
            array.add(sc.nextInt());
        }

        int A = x;
        int resA = 0;
        while(A > 0){
            if(!array.contains(A)){
                resA = A;
                break;
            }
            A--;
        }

        int B = x;
        int resB = 101;
        while(B <= 100){
            if(!array.contains(B)){
                resB = B;
                break;
            }
            B++;
        }

        if(Math.abs(resA) == Math.abs(resB)){
            if(resA > resB){
                res = resB;
            }else{
                res = resA;
            }
        }else if(Math.abs(x - resA) > Math.abs(x - resB)){
            res = resB;
        }else{
            res = resA;
        }
        System.out.println(res);
    }
}
