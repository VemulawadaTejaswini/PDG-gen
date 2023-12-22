import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int total = 0;
    int n[] = new int[5];
    int saigo = 0;
    for(int i = 0;i<5;i++){
      n[i] = sc.nextInt();
      int a = n[i]/10;
      if(n[i]%10==0){
        total+=n[i];
      }else{
        total+=(a+1)*10;
        saigo=Math.max(saigo,(a+1)*10-n[i]);
      }
    }

    System.out.println(total-saigo);
  }
}
