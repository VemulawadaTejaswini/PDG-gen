import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
    int X[] = new int[5];
    for(int i=0;i<=4;i++)
      X[i] = sr.nextInt();
    for(int j:X)
      if(X[j]==0){System.out.println(j+1);break;}
  }

}