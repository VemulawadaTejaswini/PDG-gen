import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PriorityQueue<String> s=new PriorityQueue<String>();
        Queue<String> t=new ArrayDeque<String>();
        for(int i=0;i<n;i++){
            s.add(sc.next());
        }
        int max=0;
        while(s.peek()!=null){
            String str=s.peek();
            int i=0;
            for(;s.peek()!=null&&s.peek().equals(str);i++){
                s.remove();
            }
            if(max==i){
                t.add(str);
            }else if(max<i){
                max=i;
                t.clear();
                t.add(str);
            }
        }
        while(t.peek()!=null){
            System.out.println(t.remove());
        }
    }
}