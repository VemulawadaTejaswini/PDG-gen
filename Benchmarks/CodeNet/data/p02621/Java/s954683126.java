public class Main {
  public static void main(String[] args){
    int a=Integer.parseInt(args[0]);
    int x=0;
    
    if(a>=0 && a<=10) x=a+a*a+a*a*a;
    
    System.out.println(x);
  }
}