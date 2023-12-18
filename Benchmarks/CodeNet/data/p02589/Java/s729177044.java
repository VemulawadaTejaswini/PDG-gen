import java.util.*;

public class Main {
    static int max = 100000000;
    static String[] stack = new String[max];
    static int top = 0;
    static boolean isEmpty(){return (top==0);}
    static boolean isFull(){return (top==max);}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] S = new String[n];
        HashMap<String,HashSet<String>> TYPE = new HashMap<>();
        for (int i=0;i<n;i++){
            String s = sc.next();
            S[i]=s;
            push(s);
            TYPE.put(s,new HashSet<>());
            TYPE.get(s).add(s);
        }
        while (!isEmpty()){
            String ss = pop();
            if (ss.length()>1){
                String beta = ss.substring(1);
                push(beta);
                String one;
                if (ss.length()>2){
                    one = ss.charAt(0)+ss.substring(2);
                } else {
                    one = ss.substring(0,1);
                }
                push(one);
                if (!TYPE.containsKey(beta))TYPE.put(beta,new HashSet<>());
                if (!TYPE.containsKey(one))TYPE.put(one,new HashSet<>());
                TYPE.get(beta).addAll(TYPE.get(ss));
                TYPE.get(one).addAll(TYPE.get(ss));
            }
        }
        long ans = 0;
        for (int i=0;i<n;i++){
            if (TYPE.containsKey(S[i])){
                ans+=TYPE.get(S[i]).size()-1;
            }

        }
        System.out.println(ans);
    }

    static void push(String v){
        if (isFull()){
            System.out.println("error: stack is full.");
            return;
        }
        stack[top++] = v;
    }
    static String pop(){
        if (isEmpty()){
            System.out.println("error: stack is empty");
            return null;
        }
        return stack[--top];
    }

}
