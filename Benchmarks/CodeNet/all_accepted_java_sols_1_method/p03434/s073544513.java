import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int[] cardList = new int[number];
    int scoreA = 0;
    int scoreB = 0;
    for(int i =0; i < number; i++){
     	cardList[i] = sc.nextInt(); //カード情報の格納
    }
    for(int i = 0; i < number; i++){ //お互いに最大値のカードを取る
      int maxCard = cardList[0];
      int position = 0; //最大値の位置
      for(int j = 1; j < number; j++){
          if(cardList[j] > maxCard){
            maxCard = cardList[j];
            position = j;
          }
      }
      cardList[position] = 0; //最大値の消去
      if( i % 2 == 0) scoreA += maxCard;
      else scoreB += maxCard;
    }
    System.out.println(scoreA - scoreB);
    
  }
}