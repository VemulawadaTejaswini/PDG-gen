import java.util.*;

public class Main {
    
    Scanner sc = new Scanner(System.in);
    int [] lst = new int[101];
    int n,point=0;String s;
    
    void run(){
        while(sc.hasNext()){
            s=sc.next();
            switch(s.charAt(0)){
                case '+':
                    n=pop();lst[point]+=n;break;
                case '-':
                    n=pop();lst[point]-=n;break;
                case '*':
                    n=pop();lst[point]*=n;break;
                default:
                    n=Integer.parseInt(s);
                    push(n);break;
            }
        }
        System.out.println(lst[point]);
    }
        
    void push(int n){
        point++;lst[point]=n;
    }
    
    int pop(){
        point--;return lst[point+1];
    }
    
    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
