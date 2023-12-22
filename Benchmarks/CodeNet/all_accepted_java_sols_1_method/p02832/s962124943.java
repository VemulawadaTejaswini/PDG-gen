import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int count=1;
    int Answer=0;
    
    for(int i=0;i<N;i++){
      if(sc.nextInt()==count){
        count++;
      }else{
        Answer++;
      }
    }
    
      if(Answer==N){
        Answer=-1;
      }
    
    System.out.println(Answer);
    
  }
}