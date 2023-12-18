import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s[] = new String[n];
    String tmp = "";
    long same = 1;
    long answer =0;
    for(int i=0;i<n;i++){
      tmp = sc.next();
      char[] chars = tmp.toCharArray();
      Arrays.sort(chars);
      s[i] = String.valueOf(chars);
    }
    Arrays.sort(s);
    for(int i=0;i<n-1;i++){
      if((s[i]).equals(s[i+1])){
        same+=1;
      }else{
        answer = answer+((same*(same-1))/2);
        same=1;
      }
    }
    if(same!=1){
      answer +=((same*(same-1))/2);
    }
        System.out.println(answer);
//    for(int i=0;i<n;i++){ 
//    System.out.println(s[i]);
//    }
  }
}