import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x[] = new int[n];
    for(int i = 0; i < n; i++){
      x[i] = sc.nextInt();
    }
    int hensa[] = new int[n];
  	double hensa2, hensa3,D2,D3;
    int D1 = 0;
    D2 = 0;
    D3 = 0;
    for(int i = 0; i < n; i++){
      int y = sc.nextInt();
      hensa[i] = x[i] - y;
      if(hensa[i] < 0){
        hensa[i] = -hensa[i];
      }
      hensa2 = Math.pow(hensa[i],2);
      hensa3 = Math.pow(hensa[i],3);
      D1 += hensa[i];
      D2 += hensa2;
      D3 += hensa3;
    }
  	int max = hensa[0];
    for(int i = 1; i < n; i++){
      if(hensa[i] >= max){
        max = hensa[i];
      }
    }
    System.out.println(String.format("%5f",(double)D1));
    System.out.println(String.format("%5f",Math.sqrt(D2)));
    System.out.println(String.format("%5f",Math.cbrt(D3)));
    System.out.println(String.format("%5f",(double)max));
  }
}
