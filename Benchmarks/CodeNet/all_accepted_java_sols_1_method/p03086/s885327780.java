import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int n=0;
    int max=0;
    for(int i=0;i<str.length();i++){
     if(str.charAt(i)=='A'||str.charAt(i)=='G'||str.charAt(i)=='C'||str.charAt(i)=='T'){
          n++;
     }else{
          n=0;
     }
     max=n>max?n:max;
     }
     System.out.println(max);
     }
    }