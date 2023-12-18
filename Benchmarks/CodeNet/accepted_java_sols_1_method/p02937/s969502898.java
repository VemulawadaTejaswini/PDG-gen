import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    int[][] a=new int[26][s.length()*2+1];
    for(int i=0;i<s.length();i++){
      for(int j=0;j<26;j++){
        a[j][i+1]=a[j][i];
      }
      a[s.charAt(i)-'a'][i+1]++;
    }
    for(int i=0;i<s.length();i++){
      for(int j=0;j<26;j++){
        a[j][s.length()+i+1]=a[j][s.length()+i];
      }
      a[s.charAt(i)-'a'][s.length()+i+1]++;
    }
    int ab=0;
    long ans=0;
    for(int i=0;i<t.length();i++){
      if(a[t.charAt(i)-'a'][s.length()*2]==0){
        System.out.println(-1);
        return;
      }
      int l=ab+1;
      int r=s.length()*2;
      int base=a[t.charAt(i)-'a'][ab];
      while(true){
        int gaze=l+(r-l)/2;
        if(base+1==a[t.charAt(i)-'a'][gaze]&&a[t.charAt(i)-'a'][gaze-1]==base){
          ans=ans+gaze-ab;
          ab=gaze;
          if(ab>=s.length()){ab-=s.length();}
          break;
        }else if(a[t.charAt(i)-'a'][gaze]<=base){
          l=gaze+1;
        }else if(base+1<=a[t.charAt(i)-'a'][gaze]){
          r=gaze-1;
        }
      }
    }
    System.out.println(ans);
  }
}