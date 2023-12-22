import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();sc.nextLine();
    int count=1;
    String hashh[]=new String[n];
    for(int i=0;i<n;i++){
      hashh[i]=sc.nextLine();
    }
    Arrays.sort(hashh);
    for(int i=1;i<n;i++){
      if(!hashh[i-1].equals(hashh[i])){
        count++;
      }
    }
    pl(count+"");
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
