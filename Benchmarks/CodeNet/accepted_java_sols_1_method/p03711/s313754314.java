import java.util.*;

class Main{
  static public void main(String[] args){
    Scanner sc=new Scanner(System.in);
    List<String> g1=new ArrayList<>();
    List<String> g2=new ArrayList<>();
    List<String> g3=new ArrayList<>();
    g1.add("1");
    g1.add("3");
    g1.add("5");
    g1.add("7");
    g1.add("8");
    g1.add("10"); 
    g1.add("12");
    g2.add("4");
    g2.add("6");
    g2.add("9");
    g2.add("11");
    g3.add("2");
    String str=sc.next(),str2=sc.next();
    if(g1.contains(str)&&g1.contains(str2))System.out.print("Yes");
    else if(g2.contains(str)&&g2.contains(str2))System.out.println("Yes");
    else if(g3.contains(str)&&g3.contains(str2))System.out.println("Yes");
    else System.out.println("No");
    
    sc.close();
  }
}
