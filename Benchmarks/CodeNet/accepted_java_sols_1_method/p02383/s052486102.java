import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[6];
    for(int i = 0; i < 6; i++){
      a[i] = sc.nextInt();
    }
    String str = sc.next();
    for(int i = 0; i < str.length(); i++){
      char c = str.charAt(i);
      int a0 = a[0];
      if(c == 'N'){
        a[0] = a[1];
        a[1] = a[5];
        a[5] = a[4];
        a[4] = a0;
      }else if(c == 'S'){
        a[0] = a[4];
        a[4] = a[5];
        a[5] = a[1];
        a[1] = a0;
      }else if(c == 'E'){
        a[0] = a[3];
        a[3] = a[5];
        a[5] = a[2];
        a[2] = a0;
      }else{
        a[0] = a[2];
        a[2] = a[5];
        a[5] = a[3];
        a[3] = a0;
      }
    }
    System.out.println(a[0]);
  }
}
