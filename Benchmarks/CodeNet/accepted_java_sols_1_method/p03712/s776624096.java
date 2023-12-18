import java.util.*;

class Main{
  static public void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt(),b=sc.nextInt();
    List<String>list=new ArrayList<>();
    for(int i=0;i<a;i++)
    list.add("#"+sc.next()+"#");
  
    for(int i=0;i<b+2;i++)System.out.print("#");
    System.out.println();
    for(int i=0;i<a;i++)System.out.println(list.get(i));
    for(int i=0;i<b+2;i++)System.out.print("#");
    
    sc.close();
  }
}
