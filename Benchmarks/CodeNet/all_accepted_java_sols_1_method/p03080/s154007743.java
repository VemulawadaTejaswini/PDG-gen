import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int Num = sc.nextInt();
    String BR=sc.next();
    int TotalBlue=0;
    int TotalRed=0;
    char B[]=new char[BR.length()];
    for(int i=0;i<BR.length();i++){
     B[i]=BR.charAt(i);
    }
    for(int i=0;i<BR.length();i++){
     if(B[i]=='R'){
      TotalRed++;
     }else{
      TotalBlue++;
     }
    }
    
    if(TotalRed>TotalBlue){
    System.out.println("Yes");
    }else{
    System.out.println("No");
    }
  }
}

