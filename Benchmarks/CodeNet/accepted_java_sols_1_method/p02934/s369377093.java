import java.util.*;
class Main{
  public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int N = stdIn.nextInt();
    double[] a=new double[N];
    double sum=0.0;
    for(int i=0;i<N;i++){
      a[i]=Double.parseDouble(stdIn.next());
      sum+=1.0/a[i];
    }
    System.out.println(1.0/sum);
  }
}