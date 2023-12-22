import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String c = sc.next();
      String[] s = new String[4];
      int[] cnt = new int[2];
      String ans;

      for(int i=0;i<4;i++){
        if(i!=3){
          s[i] = c.substring(i,i+1);
        }
        else{
          s[i] = c.substring(3);
        }
      }

if(s[0].equals(s[1])){
/////////////////////////////////////////////
  if(!s[2].equals(s[0]) && s[2].equals(s[3])){
    ans = "Yes";
  }
  else{
    ans = "No";
  }
/////////////////////////////////////////////
}
else{
/////////////////////////////////////////////
  for(int i=0;i<2;i++){
    for(int j=2;j<4;j++){
      if(s[i].equals(s[j])){
        cnt[i]++;
      }
    }
  }
  if(cnt[0]==1 && cnt[1]==1){
    ans = "Yes";
  }
  else{
    ans = "No";
  }
/////////////////////////////////////////////
}

System.out.println(ans);
    }
}