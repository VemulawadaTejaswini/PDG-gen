import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] a = new int[n+1];
    int[] b = new int[n+1];
    for(int i=1;i<=n;i++){
        a[i]=sc.nextInt();
    }
    int total=0;
    for(int i=n;i>0;i--){
        int pal=0;
        for(int j=2*i;j<=n;j+=i){
            pal+=b[j];
        }
        b[i]=(pal+a[i])%2;
        total+=b[i];
    }
    System.out.println(total);
    int j=1;
    for(int i=0;i<total;i++){
        while(b[j]==0){
            j++;
        }
        System.out.print(j+" ");
        j++;
    }
  }
}

