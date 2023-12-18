import java.util.Scanner;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n;
  int[] s = new int[1000];
 
  while(true){
  double m=0,l=0,a2;
  n = sc.nextInt();
  if(n==0) break;
  for(int i=0;i<n;i++){
    s[i] = sc.nextInt();
    m += s[i];
    l += s[i]*s[i];
  }
    m /=n;
    l /=n;
    a2 = l-m*m;
    System.out.printf("%f\n",Math.sqrt(a2));
}
  sc.close();
}
}
