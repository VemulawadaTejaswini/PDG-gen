import java.util.*;

class Main{
  static public void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    Set<String>set=new HashSet<>();
    for(int i=0;i<str.length();i++){
        String num=String.valueOf(str.charAt(i));
        set.add(num);
    }
    System.out.println(str.length()==set.size()?"yes":"no");
    sc.close();
  }
}
