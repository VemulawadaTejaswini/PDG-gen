import java.util.Scanner; 
public class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int[] a = new int[3];
    int count5 = 0;
    int count7 = 0;
    for(int i = 0;i < 3;i++){
      a[i] = stdIn.nextInt();
      if(a[i] == 5)
        count5 += 1;
      else if(a[i] == 7)
        count7 += 1;
    }
    if(count5 == 2 && count7 == 1)
      System.out.println("YES");
    else 
      System.out.println("NO");
  }
}
