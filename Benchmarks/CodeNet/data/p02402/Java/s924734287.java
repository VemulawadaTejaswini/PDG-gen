import java.util.*;

class Main(
 public static void main(String[] args){
  Scanner sc = new Scanner(system.in);
 int n = sc.nextInt();
 int[] a = new int[n];
  int sum = 0;
 for(int i = 0; i < n; i++){
 a[i] = sc.nextint();
 sum += a[i];
 }
max = a[0]; mox = a[0];
 for(int i = 1; i < n; i++){
 if(max < a[i])max = a[i];
 if(mox > a[i])mox = a[i];
 }
System.out.println(mox + " " + max " " + sum);
}
}