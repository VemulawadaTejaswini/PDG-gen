import java.util.*;
public class Main{
  public static int gcd (int a, int b) {
	int temp;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return b;
  }
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int A[] =new int [N];
    int B[] =new int [N];
    for(int i=0;i<N;i++){
      A[i] =sc.nextInt();
      B[i] =A[i];
    }
    int t =gcd(A[0],A[1]);
    for(int i=2;i<N;i++){
      t =gcd(t,A[i]);}
    if(t!=1){System.out.println("not coprime");}
    else{
      for(int i=0;i<N;i++){
        for(int j=i+1;j<N;j++){
        t =gcd(A[i],A[j]);
        if(t!=1){System.out.println("setwise coprime");System.exit(0);}
        }
      }
    System.out.println("pairwise coprime");
    }
  }
}