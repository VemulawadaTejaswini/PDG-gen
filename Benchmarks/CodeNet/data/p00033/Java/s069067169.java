import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                for(int i = 0; i < n; i++){
                        ArrayList<Integer> a = new ArrayList<Integer>();
                        for(int j = 0; j < 10; j++){
                                a.add(sc.nextInt());
                        }   
                        ArrayList<Integer> b = new ArrayList<Integer>();
                        ArrayList<Integer> c = new ArrayList<Integer>();
                        b.add(0);
                        c.add(0);
                        boolean flag = true;
                        while(flag && !a.isEmpty()){
                                int ball = a.remove(0);
                                ArrayList<Integer> bigger = b.get(b.size()-1) < c.get(c.size()-1) ? c: b;
                                ArrayList<Integer> smaller = b.get(b.size()-1) < c.get(c.size()-1) ? b: c;
                                if(bigger.get(bigger.size()-1) < ball){
                                        bigger.add(ball);
                                }else if(smaller.get(smaller.size()-1) < ball){
                                        smaller.add(ball);
                                }else{
                                        flag = false;
                                }   
                        }   
                        String s = flag ? "YES": "NO";
                        System.out.println(s);
                }   
                sc.close();
        }   
}