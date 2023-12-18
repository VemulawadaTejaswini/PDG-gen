import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    char[] c = sc.next().toCharArray();
    List<Integer> list = new ArrayList<>();
    int cnt = 1;
    if(c[0]=='0')list.add(0);
    for(int i=1;i<n;i++){
      if(c[i]==c[i-1])cnt++;
      else{
        list.add(cnt);
        cnt=1;
      }
    }
    list.add(cnt);
    int max = 0;
    int[] sum = new int[list.size()+1];
    sum[0]=0;
    for(int i=1;i<=list.size();i++)sum[i]=sum[i-1]+list.get(i-1);
    for(int i=0;i<=list.size();i+=2){
      int j=Math.min(i+2*k+1,list.size());
      max=Math.max(max,sum[j]-sum[i]);
    }
    System.out.println(max);
  }
}