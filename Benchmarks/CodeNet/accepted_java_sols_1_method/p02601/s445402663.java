import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int[] card=new int[3];
    for(int i=0;i<3;i++) card[i]=s.nextInt();
    int K=s.nextInt();
    for(int i=0;i<=K;i++){
      double c1=Math.pow(2,i)*card[1];
      if(card[0]<c1&&c1<Math.pow(2,K-i)*card[2]){
        System.out.println("Yes");
        break;
      }
      if(i==K) System.out.println("No");
    }
  }  
}