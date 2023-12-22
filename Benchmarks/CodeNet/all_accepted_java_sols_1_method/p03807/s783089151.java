import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ki=0;
    int gu=0;
    for(int i=0;i<n;i++){
      if((sc.nextInt()&1)==1){
        ki++;
      }else{
        gu++;
      }
    }
    if((ki&1)==0){
      System.out.println("YES");
    }else if(ki+gu==1){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}