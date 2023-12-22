import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    int answer=0;
    int max=a;
    int other1=b;
    int other2=c;
    if(b>max){
      max=b;
      other1=a;
      other2=c;
    }
    if(c>max){
      max=c;
      other1=a;
      other2=b;
    }
    for(int i=0;i<k;i++){
      max *= 2;
    }
    System.out.print(max+other1+other2);
  }
}
