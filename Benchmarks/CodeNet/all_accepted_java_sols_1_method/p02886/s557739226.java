import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
   	String d[] = sc.nextLine().split(" ", 0);
    int sum =0;
    
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        int a =Integer.parseInt(d[i]);
        int b =Integer.parseInt(d[j]);
        sum+=a*b;
      }
    }
    
    System.out.println(sum);
    
  }
}