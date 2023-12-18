import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int n = sc.nextInt();
    int[] num = new int[w];
    for(int i=0;i<num.length;i++){
      num[i] = i+1;
    }
    for(int j=0;j<n;j++){
      String str = sc.next();
      String[] ab = str.split(",");
      int a = Integer.parseInt(ab[0])-1;
      int b = Integer.parseInt(ab[1])-1;
      int temp = num[a];
      num[a] = num[b];
      num[b] = temp;
    }
    for(int k=0;k<w;k++){
      System.out.println(num[k]);
    }
  }
}