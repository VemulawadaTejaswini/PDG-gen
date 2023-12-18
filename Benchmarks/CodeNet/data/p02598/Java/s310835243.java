import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    long K =sc.nextLong();
    double A[] =new double[N];
    for(int i=0;i<N;i++){
      A[i] =sc.nextDouble();}
    List<String> B =Arrays.asList(A);
    Collections.sort(B, Collections.reverseOrder());
    for(int i=0;i<K;i++){
      double t = B.get(0);
      t =t/2;
      B.remove(0);
      B.add(t);
      B.add(t);
       Collections.sort(B, Collections.reverseOrder());}
    double m =B.get(0);
    long n =(long)m;
    if(n==m){System.out.println(n);}
    else{System.out.println(n+1);}
  }
}