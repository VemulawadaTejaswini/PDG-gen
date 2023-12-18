import java.util.*;

class Main{
  public static Scanner cin;
  public static HashSet m;

  public static String reverse(String s){
    return new StringBuffer(s).reverse().toString();
  }

  public static void arrange(){
    String s=cin.nextLine();
    m=new HashSet<String>();
    int i=1;
    for(;i<s.length();i++){
      String s1=s.substring(0,i),s2=s.substring(i);
      m.add(s1+s2);
      m.add(reverse(s1)+s2);
      m.add(s1+reverse(s2));
      m.add(reverse(s1)+reverse(s2));
      m.add(s2+s1);
      m.add(reverse(s2)+s1);
      m.add(s2+reverse(s1));
      m.add(reverse(s2)+reverse(s1));
    }
    System.out.println(m.size());
  }

  public static void main(String []args){
    cin=new Scanner(System.in);
    int i=0,n=cin.nextInt();
    cin.nextLine();
    for(;i<n;i++)arrange();
  }
}