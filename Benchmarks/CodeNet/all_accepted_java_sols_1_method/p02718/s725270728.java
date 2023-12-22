import java.util.Scanner;
class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int counter = 0;
    int sum = 0;
    double min;
    int[] a = new int[n];
    
    for(int i = 0;i < n;i++){
	  a[i] = scan.nextInt();
      sum += a[i];
    }
    
    min = sum / (4*(double)m);
    
    for(int i = 0;i < n;i++){
      if(a[i] >= min)counter++;
    }
    
    if(counter >= m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
