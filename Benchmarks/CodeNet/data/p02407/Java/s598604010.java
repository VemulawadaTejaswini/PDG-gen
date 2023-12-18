import java .until*
pubulc class Main{
 public static void main (String args []){
  Scaner sc=new Scaner(System.in);
  int n=sc.nextInt(n);
  int a[]= new int[n];
  for(int i =0;i<n; i++){
     a[i]=sc.nextInt();
  }
  System.out.print(a[n-1]);
  for(int i =n-2;i>=0;i--){
      System.out.print(" "+a[i]);
      }
      System.out.println();
     }
}