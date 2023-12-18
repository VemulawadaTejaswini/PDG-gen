import java.util.*;

class Queue {
    private List<Integer> que = new ArrayList<Integer>();
    private int size = 0;
    private long sum = 1;
    
    public Queue(int s){
        size = s;
    }
    
    public void add(int i){
        if(que.size() < size){
            que.add(i);
            sum = sum * i;
        } else {
            sum = sum / que.remove(0);
            que.add(i);
            sum = sum * i;
        }
    }
    
    public long sum(){
        return this.sum;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
      
        Queue que = new Queue(K);
      List<Boolean> biggers = new ArrayList<Boolean>();
      long beforePoint = 0;
      for(int i=0;i<N;i++){
            que.add(sc.nextInt());
            if(i == K-1){
                beforePoint = que.sum();
            } else if(i >K-1){
              if(beforePoint < que.sum()){
                biggers.add(true);
              } else {
                biggers.add(false);
              }
                beforePoint = que.sum();
            } 
      }
      
      for(boolean bigger : biggers){
        if(bigger){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }
    }
}