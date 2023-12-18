import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      String s = sc.next();

      int ans = 0;

for(int i=0;i<10;i++){
  for(int j=0;j<10;j++){
    for(int k=0;k<10;k++){
      int flagi = 0;
      int flagj = 0;
      int flagk = 0;
////////////////////////////////////////////////////////////
for(int l=0;l<n;l++){
  int a = s.charAt(l) - 48;
  if(flagi==0 && a==i){
    flagi = 1;
  }
  else if(flagi==1 && flagj==0 && a==j){
    flagj = 1;
  }
  else if(flagi==1 && flagj==1 && flagk==0 && a==k){
    ans++;
    //System.out.println("ijk="+i+""+j+""+k);
    break;
  }
}
////////////////////////////////////////////////////////////
    }
  }
}

      System.out.println(ans);

    }
}
