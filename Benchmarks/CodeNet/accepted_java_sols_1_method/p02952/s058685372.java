import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int Number = sc.nextInt();
    int count=0;
    int valLen =0;
    for(int i=1; i<=Number;i++){
      valLen= String.valueOf( i ).length();
    	if(valLen%2==1){
        count++;
        }
    }System.out.println(count);
  }
}

