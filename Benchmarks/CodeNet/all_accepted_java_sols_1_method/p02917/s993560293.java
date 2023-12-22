import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();//整数列Aiの個数を入力
    int [] Ai = new int [N];
    int [] Bi = new int [N-1];
    int sum = 0;
    for(int j=0;j<N-1;j++){
      Bi[j] = scan.nextInt();
    }
    Ai[0] = Bi[0];
    Ai[Ai.length-1] = Bi[Bi.length-1];
    for(int i=1;i<N-1;i++){
      if(Bi[i]>Bi[i-1]){
        Ai[i]=Bi[i-1];
      }
      else if(Bi[i]<Bi[i-1]){
        Ai[i]=Bi[i];
      }
      else{
        Ai[i]=Bi[i];
      }
    }
    for(int x=0;x<N;x++){
      sum += Ai[x];
    }
    System.out.println(sum);
  }
}
