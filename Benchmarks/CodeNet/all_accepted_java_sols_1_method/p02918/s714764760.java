import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int count = 0;
    int m = n;
    String[] s = new String[n];


    s = sc.next().split("");

    for(int i=0; i<n-1; i++){
      if(s[i].equals("R")&&(s[i+1].equals("L"))){
        count += 1;
      }

    }
    if(s[0].equals("L")){
      count += 1;
      m += 1;
    }
    if(s[n-1].equals("R")){
      count += 1;
      m += 1;
    }
    int ans = Math.min(n-1,m-2*count+2*k);
    System.out.println(ans);

  }
}