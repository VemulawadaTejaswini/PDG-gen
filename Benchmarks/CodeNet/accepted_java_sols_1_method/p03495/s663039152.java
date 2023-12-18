import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
  int N=sc.nextInt();
  int K=sc.nextInt();
  int[] data=new int[200000];
  Arrays.fill(data,0);
  int i,cnt=0,ans=0;
  for(i=0;i<N;i++) {
    data[sc.nextInt()]++;
  }
  for(i=0;i<200000;i++){
    if(data[i]>0)cnt++;
  }
  Arrays.sort(data);
  for(i=200000-cnt;i<200000-K;i++){
    ans+=data[i];
  }
  System.out.println(ans);
}}