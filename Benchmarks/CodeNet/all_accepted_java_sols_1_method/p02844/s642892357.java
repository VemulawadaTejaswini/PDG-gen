import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] cs = s.toCharArray();
        int result = 0;
        Queue<Character> q = new ArrayDeque<>(3);
        for(int i=0;i<=9;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<=9;k++){
                    q.clear();
                    q.add((char)(48+i));
                    q.add((char)(48+j));
                    q.add((char)(48+k));
                    for(char c : cs){
                        if(c != q.peek()) continue;
                        q.poll();
                        if(q.isEmpty()){
                            result++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}