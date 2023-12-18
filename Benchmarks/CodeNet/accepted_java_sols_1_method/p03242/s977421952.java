import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.next(),ans="";
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='1'){
        ans+="9";
      }
else if(str.charAt(i)=='9'){
        ans+="1";
      }
else{
        ans+=str.charAt(i)+"";
}
    }
System.out.print(ans);
  }
}