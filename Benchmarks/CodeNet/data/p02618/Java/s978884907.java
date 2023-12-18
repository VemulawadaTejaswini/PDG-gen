import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt();
    int[] c=new int[26];
    for(int i=0;i<26;i++){
      c[i]=sc.nextInt();
    }
    int[][] s=new int[d][26];
    for(int i=0;i<d;i++){
      for(int j=0;j<26;j++){
        s[i][j]=sc.nextInt();
      }
    }
    int[] l=new int[26];
    for(int i=0;i<d;i++){
      int choice=choice(c,s[i],l,i+1);
      l[choice]=i+i;
      System.out.println(choice+1);
    }
  }
  static int choice(int[] c,int[] s,int[] l,int td){
    int no=0;
    for(int i=0;i<26;i++){
      no=no+c[i]*(td-l[i]);
    }
    int res=0;
    int rev=c[0]*(td-l[0])+s[0];
    for(int i=1;i<26;i++){
      int iv=c[i]*(td-l[i])+s[i];
      if((rev<iv)||(rev==iv&&s[res]<s[i])){
        res=i;
        rev=iv;
      }
    }
    return res;
  }
}