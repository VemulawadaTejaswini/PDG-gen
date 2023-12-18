import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(sc.next());
    for(int i=0; i<sb.length(); i++){
    	sb.setCharAt(i, 'x');
    }
    System.out.println(sb.toString());
  }
}

    
    
