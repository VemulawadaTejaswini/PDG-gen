import java.util.*;
class Main{
  public static void main(String args[]){
    int ary[] = new int[3];
    Scanner scan = new Scanner(System.in);
    for(int i=0;i<3;i++){
      ary[i] = scan.nextInt();
    }
    Arrays.sort(ary);
    System.out.println(ary[0] + " " + ary[1] + " " + ary[2]);
  }
}