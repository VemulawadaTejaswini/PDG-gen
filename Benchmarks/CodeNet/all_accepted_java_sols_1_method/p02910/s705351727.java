import java.util.Scanner;
class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
  String str=scan.next();
  boolean bool=true;
  for(int i=0;i<str.length();i++){
  	char ch=str.charAt(i);
    if(i%2==0){if(ch=='L')bool=false;}
    else{if(ch=='R')bool=false;}
  }
  System.out.println(bool?"Yes":"No");
}
}