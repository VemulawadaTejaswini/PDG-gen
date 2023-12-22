import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int k = sc.nextInt();
    int[] a = new int[s.length()];
    for(int i=0;i<s.length();i++){
      a[i]=s.charAt(i)=='a'?0:'z'-s.charAt(i)+1;
    }
    for(int i=0;i<s.length();i++){
      if(a[i]<=k){
        k-=a[i];
        a[i]=0;
      }
    }
    if(k%26!=0){
      a[s.length()-1]-=(k%26);
      if(a[s.length()-1]<0){
        a[s.length()-1]+=26;
      }
    }
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<s.length();i++){
      if(a[i]==0){
        sb.append('a');
      }else{
        sb.append((char)('z'-a[i]+1));
      }
    }
    System.out.println(sb.toString());
  }
}