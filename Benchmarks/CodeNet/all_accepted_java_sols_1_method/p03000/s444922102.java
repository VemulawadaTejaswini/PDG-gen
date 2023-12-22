import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int[] l=new int[n+1];
    l[0]=0;
    for(int i=1;i<=n;i++){
        l[i]=l[i-1]+sc.nextInt();
    }
    for(int i=1;i<=n;i++){
        if(l[i]>x){
            System.out.println(i);
            return;
        }
    }
    System.out.println(n+1);
  }
}
