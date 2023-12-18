import java.util.*;

public class Main{
   Scanner in = new Scanner(System.in);

   HashMap<String, Integer> op = new HashMap<String, Integer>(){{
       put("*", 1); put("/", 1);
       put("+", 2); put("-", 2);
       put("(", 3); put(")", 3);
   }};

   void solve(){
       int n = in.nextInt(); in.nextLine();
       for(int i = 0; i < n; i++){
           ArrayDeque<String> q = toRevPolish(in.nextLine());
           System.out.println(calc(q));
       }
   }

   ArrayDeque<String> toRevPolish(String str){
       ArrayDeque<String> p = new ArrayDeque<>(), s = new ArrayDeque<>();
       str = str.replace("=", "");

       boolean bfIsOp = true;
       while(str.length() > 0){
           int idx = nextIndex(str, bfIsOp);
           String t = str.substring(0, idx);
           bfIsOp = isOperator(t);
           if(t.equals("(")){
               s.push(t);
           }else if(t.equals(")")){
               while(!s.peek().equals("(")){
                   p.push(s.pop());
               }
               s.pop();
           }else{
               while(s.size() > 0 && getRank(t) > getRank(s.peek())){
                   p.push(s.pop());
               }
               s.push(t);
           }
           str = str.substring(idx);
       }

       while(p.size() > 0){
           s.push(p.pop());
       }

       return s;
   }

   int calc(ArrayDeque<String> q){
       Deque<Integer> t = new ArrayDeque<>();

       while(q.size() > 0){
           String s = q.pop();
           if(isOperator(s)){
               int a = t.pop(), b = t.pop();
               switch(s){
                   case "+": t.push(b + a); break;
                   case "-": t.push(b - a); break;
                   case "*": t.push(b * a); break;
                   case "/": t.push(b / a); break;
               }
           }else{
               t.push(Integer.parseInt(s));
           }
           
       }

       return t.pop();
   }

   int nextIndex(String str, boolean bfIsOp){
       int idx = 0;
       if(bfIsOp && str.charAt(0) == '-') idx++;
       while(idx < str.length() && !isOperator(str.charAt(idx))) idx++;
       if(idx == 0) idx = 1;
       return idx;
   }

   boolean isOperator(char ch){
       return "*/+-()".indexOf(ch) > -1;
   }

   boolean isOperator(String s){
       return s.length() == 1 && isOperator(s.charAt(0));
   }

   int getRank(String str){
       return isOperator(str) ? op.get(str) : 0;
   }
    
   public static void main(String[] args){
       new Main().solve();    
   }
}