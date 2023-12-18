import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=0;
    String str=sc.next();
    char[] c=str.toCharArray();
    for(int i=0;i<n;i++){
      if(c[i]=='1'){
        f++;
      }
    }
    int d=0;
    for(int i=0;i<n;i++){
      char[] fc=str.toCharArray();
      d=f;
      if(fc[i]=='1'){
        fc[i]='0';
        d--;
      }else{
        fc[i]='1';
        d++;
      }
      if(fc[n-1]=='1'&&d>1){
        System.out.println(2);
      }else{
        System.out.println(1);
      }
    }
  }
}
