import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String Sk[] = S.split("");
    int N = S.length();
    
    boolean easyFlag = true;
    
    for(int i=0; i<N; i++){
      if(Sk[i].equals("R")){
        if((i%2)==1){
          easyFlag = false;
          break;
        }
      }
      if(Sk[i].equals("L")){
        if((i%2)==0){
          easyFlag = false;
          break;
        }
      }
    }
    
    if(easyFlag)
      System.out.println("Yes");
    else
      System.out.println("No");
    
  }
}