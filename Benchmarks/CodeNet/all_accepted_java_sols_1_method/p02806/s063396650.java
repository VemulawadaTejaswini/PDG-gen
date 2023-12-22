import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] s = new int[n];
    String[] t = new String[n];
    
    for(int i = 0; i < n; i++){
      t[i] = sc.next();
      s[i] = sc.nextInt();
    }
    
    String x = sc.next();
    
    int total = 0;
    
    for(int j = 0; j < n; j++){
      if(x.equals(t[j])){
        for(int k = j+1; k < n; k++){
          total += s[k];
        }
      }
    }
    
    System.out.println(total);
  }
}
