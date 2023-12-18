import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    String l,ans="";
    char[] a = new char[1200];
    Scanner sc = new Scanner(System.in);
    l = sc.nextLine();
    for(int i=0;i<l.length();i++){
    a[i] = l.charAt(i);
    if(a[i]>='A' && a[i]<='Z'){
      a[i] = Character.toLowerCase(a[i]);
    }else if(a[i]>='a' && a[i]<='z'){
      a[i] = Character.toUpperCase(a[i]);
    }
    ans += String.valueOf(a[i]);
    }
    
    System.out.println(ans);
    
    sc.close();
  }
  
}
