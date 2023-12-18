import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //number of member
        int m = sc.nextInt(); //number of relationship 
        int m_x = 0;
        ArrayList<Set<Integer>> list = new ArrayList<Set<Integer>>();
        Queue<Integer> que = new ArrayDeque<>();
        for(int i=0;i<=n;i++){
            Set<Integer> set = new HashSet<Integer>();
            list.add(set);  //n+1回配列を作っておく
        }
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);
        }
        
        Monmo momo = new Monmo(n);
        
        for(int i=1;i<=n;i++){
            int count=0;
            //if(!list.get(i))
            if(momo.belong(i))continue;
            for(int j : list.get(i)){
                count=1;
                que.add(j);
                momo.belong(j);
            }
            while(que.peek() != null){
                //System.out.println(que);
                int back_que = que.poll();
                count++;
                //System.out.println(back_que + " count:" + count);
                for(int j : list.get(back_que)){
                    if(momo.belong(j)){}
                    else que.add(j);
                }
            }
            //System.out.printf("%n");
            if(m_x<count)m_x=count;
        //momo.shutu();
        }
        System.out.println(m_x);
    }
}

class Monmo {
    ArrayList<Integer> guru = new ArrayList<Integer>();
    
    Monmo(int n){
        for(int i=0;i<=n;i++){
            guru.add(0); //属するナンバー格納用
        }
    }
    boolean belong(int g){
        if(guru.get(g) != 0){
            return true;
        }else{
            guru.set(g,1);
            return false;
        }
    }
    void shutu(){
        System.out.println(guru);
    }
}
