import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] card=new int[n+1];
    int kari=0;
    int cnt1=0;
    int cnt2=0;
    for(int i=1;i<=n;i++)
      card[i]=sc.nextInt();
    for(int i=1;i<=n;i++)
      for(int j=n;j>=i+1;j--)
        if(card[j]>card[j-1]){
          kari=card[j-1];
          card[j-1]=card[j];
          card[j]=kari;
        }
    for(int i=1;i<=n;i++){
      if(i%2==1) cnt1+=card[i];
      else cnt2+=card[i];
    }
    System.out.println(cnt1-cnt2);
  }
}