import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int count = 0;
        int total =0;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i < N ;i++){
            int num = Integer.parseInt(sc.next());
            total += num;
            l.add(num);
        }
        float border = total/(4f*M);
        for(Integer i : l){
            if((float)i >= border){
                count += 1;
            }
        }
        if(count >= M){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}