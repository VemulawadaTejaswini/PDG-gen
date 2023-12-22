import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.next());
        Deque<Integer> B = new ArrayDeque<Integer>();
        int a;
        for (int i = 0; i < N; i++){
            a = Integer.parseInt(sc.next());
            if (i % 2 == 0){
                B.addLast(a);
            } 
            else{
                B.addFirst(a);
            }
        }
        
        for (int i = 0; i < N; i++){
            if (N % 2 == 0){
                out.print(B.pop() + " ");
            }
            else{
                out.print(B.removeLast() + " ");
            }
            
        }

        //テンプレ
        sc.close();
        out.flush();
    }
}