import java.util.*;

class Main{
  static public void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine(),str2=sc.nextLine();
    int num=0;
    for(int i=0;i<str1.length();i++)
      if(str1.charAt(i)!=str2.charAt(i))
        num++;
   
    System.out.println(num);
  }
}