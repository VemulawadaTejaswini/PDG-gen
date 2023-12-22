import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] ch=sc.next().toCharArray();
    int[] anum=new int[26];
    int f=0,e=0;
    if(ch.length%2!=0){
      System.out.println("No");
    }else{
      for(int i=0;i<26;i++){
        anum[i]=0;
      }
      for(char flag='a';flag<='z';flag++){
        for(int i=0;i<ch.length;i++){
          if(flag==ch[i]){
            anum[f]++;
          }
        }
        if(anum[f]%2!=0){
          System.out.println("No");
          e++;
          break;
        }
        f++;
      }
      if(e==0){
        System.out.println("Yes");
      }
    }
  }
}