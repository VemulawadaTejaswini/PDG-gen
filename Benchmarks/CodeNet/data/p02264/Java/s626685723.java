import java.util.*;

class IntQue{
    final int MAX=100000;
    int[] q;
    int head,tail;
    IntQue(){
        q=new int[MAX];
        head=0;tail=0;
    }
    boolean isEmpty(){
        return head==tail;
    }
    void enqueue(int time){
        q[tail]=time;
        if(tail+1==MAX) tail=0;
        else tail++;
    }
    int dequeue(){
        int t=q[head];
        if(head+1==MAX) head=0;
        else head++;
        return t;
    }
}
class StringQue{
    final int MAX=100000;
    String[] q;
    int head,tail;
    StringQue(){
        q=new String[MAX];
        head=0;tail=0;
    }
    boolean isEmpty(){
        return head==tail;
    }
    void enqueue(String name){
        q[tail]=name;
        if(tail+1==MAX) tail=0;
        else tail++;
    }
    String dequeue(){
        String t=q[head];
        if(head+1==MAX) head=0;
        else head++;
        return t;
    }
}
public class Main {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        IntQue iq=new IntQue();
        StringQue sq=new StringQue();
        int n=sc.nextInt();
        int qms=sc.nextInt();
        for(int i=0;i<n;i++){
            sq.enqueue(sc.next());
            iq.enqueue(sc.nextInt());
        }
        int total=0;
        while(!(iq.isEmpty())){
            String name=sq.dequeue();
            int time=iq.dequeue();
            if(time>qms){
                total=total+qms;
                sq.enqueue(name);
                iq.enqueue(time-qms);
            }else{
                total=total+time;
                System.out.printf("%s %d\n",name,total);
            }
        }
    }
}