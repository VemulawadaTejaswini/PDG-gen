import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int slen = s.length();
    int zennhann = (slen - 1) / 2;
    int kouhann = (slen + 3) / 2 - 1;
    String mae = s.substring(0,zennhann);
    int mlen = mae.length();
    String usiro = s.substring(kouhann,slen);
    int ulen = usiro.length();
    String aa = "";
    String bb = "";
    for(int i = 0;i < mlen;i++){
      aa = mae.substring(i,i+1);
      bb = mae.substring(mlen - i - 1 ,mlen - i);
      if(!(aa.equals(bb))){
        System.out.println("No");
        return;
      }
    }
    for(int i = 0;i < ulen;i++){
      aa = usiro.substring(i,i+1);
      bb = usiro.substring(ulen -i -1,ulen -i);
      if(!(aa.equals(bb))){
        System.out.println("No");
        return;
      }
    }
    for(int i = 0;i < slen;i++){
      aa = s.substring(i,i+1);
      bb = s.substring(slen -i -1,slen -i);
      if(!(aa.equals(bb))){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}
