import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int Num = sc.nextInt();
    int Dis = sc.nextInt();
    int[] Xa = new int[Num];
    int[] Ya = new int[Num];
    for(int i=0;i<Num;i++){
      Xa[i] = sc.nextInt();
      Ya[i] = sc.nextInt();
    }
    int R = 0;
    for(int k=0;k<Num;k++){
      if(Math.pow(Xa[k],2)+Math.pow(Ya[k],2)<=Math.pow(Dis,2))R++;
    }
    System.out.println(R);
  }
}