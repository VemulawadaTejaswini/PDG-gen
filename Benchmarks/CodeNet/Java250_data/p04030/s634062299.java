import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String edita="";
    sc.close();

    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='0'){
        edita+="0";
      }else if(s.charAt(i)=='1'){
        edita+="1";
      }else{
        if(edita.length()>0){
          edita=edita.substring(0,edita.length()-1);
        }
      }
    }

    System.out.println(edita);
  }
}