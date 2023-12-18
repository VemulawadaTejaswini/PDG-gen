import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    String[] title=new String[N];
    int[] time=new int[N];
    
    for(int i=0;i<N;i++){
      title[i]=sc.next();
      time[i]=sc.nextInt();
    }
    
    String target=sc.next();
    int Answer=0;
    
    for(int j=0;j<N;j++){
      if(title[j].equals(target)){
        for(int k=j+1;k<N;k++){
          Answer+=time[k];
        }
      }
    }
    
    System.out.println(Answer);
    
  }
}