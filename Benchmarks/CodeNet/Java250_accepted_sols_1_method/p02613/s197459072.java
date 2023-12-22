import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    // System.out.println("Hello World!");
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();//ここでコンソールに入力したものを取得
    
    int resultAC = 0;
    int resultWA = 0;
    int resultTLE = 0;
    int resultRE = 0;
    
    for(int i=0; i<num+1; i++){
        
        
        String inputStr = scan.nextLine();//ここでコンソールに入力したものを取得
        
        
        switch (inputStr) {
            case "AC"://scoreが5の時
              resultAC += 1;
              continue;
            //   break;
            case "WA"://scoreが4の時
              resultWA += 1;
              continue;
            //   break;
            case "TLE"://scoreが3の時
              resultTLE += 1;
              continue;
            //   break;
            case "RE"://scoreが2の時
              resultRE += 1;
              continue;
            //   break;
            
            default://scoreが上記以外の時
              break;
        }
        
    }
    // System.out.println();
    System.out.println("AC x " + resultAC);
    System.out.println("WA x " + resultWA);
    System.out.println("TLE x " + resultTLE);
    System.out.println("RE x " + resultRE);



  }

}