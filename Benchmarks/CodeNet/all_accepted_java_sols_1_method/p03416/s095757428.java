import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int cnt = 0;
    for(int i=A; i<=B; i++){
      boolean b = true;
      String temp = String.valueOf(i);
      for(int j=0; j<temp.length()/2; j++){
        if(temp.charAt(j)!=temp.charAt(temp.length()-j-1)){
          b = false;
        }
      }
      if(b){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
      
    
    