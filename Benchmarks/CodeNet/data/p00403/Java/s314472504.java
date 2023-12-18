import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>(){};
        int L = sc.nextInt();
        for(int i = 1 ; i <= L ; i++){
            int c = sc.nextInt();
            if(c > 0){
                if(s.search(c) != -1){
                    System.out.println(i);
                    break;
                }
                else
                    s.push(c);
            }
            else{
                if(s.empty() || (-c != s.peek()) ){
                    System.out.println(i);
                    break;
                }
                else
                    s.pop();
            }
            if(i == L)
                System.out.println("OK");
        }
    }
}
