import java.util.Scanner;

public class Main{
  public static void main(String args[]){
  Scanner scanner = new Scanner(System.in);
  String esu = scanner.next();
  int raincnt = 0;
  int rainrec = 0;
  for(int i=0;i<3;i++){
    if(esu.charAt(i)=='R'){    
      raincnt++;
    }else{
      if(raincnt>rainrec){
      rainrec = raincnt;
      }else{
      }
      raincnt = 0;
 
    }
  }

    if(raincnt>rainrec){
      System.out.println(raincnt);
      }else{
      System.out.println(rainrec);
      }
  }
}

