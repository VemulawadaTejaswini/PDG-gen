public class Main { 
  public static void main(String[] args){
     int a = 60;
     int b = 3600;
     int S = new java.util.Scanner(System.in).nextInt(); //??????????§??????\???
     System.out.println( S/b +":" +  S%b/a+ ":"  +  S%b%a );
  }
}