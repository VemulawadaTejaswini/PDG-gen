import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // 変数宣言
        String[][] cardNumber = {{"","",""},{"","",""},{"","",""}};
        String judge = "No";

        // Scannerインスタンス化
        Scanner sc = new Scanner(System.in);
        
        // ビンゴカード数字設定入力
        for( int index=0; index < cardNumber.length; index++ ){
            for( int innerIndex=0; innerIndex<cardNumber[index].length; innerIndex++){
                cardNumber[index][innerIndex] = sc.next();
            }
        }

        // 数字選択化数入力
        int choiceCounter = sc.nextInt();
        String[] selectNumber = new String[choiceCounter + 1];

        // ビンゴ選択入力
        for( int index=0; index <= choiceCounter ; index++ ){
            selectNumber[index] = sc.nextLine();
        }

        sc.close();

        // ビンゴ選択処理（当てた個所には×を入力）
        for( int index=0; index < cardNumber.length; index++ ){
            for( int innerIndex=0; innerIndex<cardNumber[index].length; innerIndex++){
                for(int j=0; j <= choiceCounter; j++){
                    if( cardNumber[index][innerIndex].equals(selectNumber[j]) ){
                        cardNumber[index][innerIndex] = "×";
                    }
                }
            }
        }

        // ビンゴ判定(行)
        for( int index=0; index < cardNumber.length; index++ ){
            if(cardNumber[index][0].equals("×") && cardNumber[index][1].equals("×") && cardNumber[index][2].equals("×")){
                judge = "Yes";
            }
        }

        // ビンゴ判定(列)
        for( int index=0; index < cardNumber.length; index++ ){
            if(cardNumber[0][index].equals("×") && cardNumber[1][index].equals("×") && cardNumber[2][index].equals("×")){
                judge = "Yes";
            }
        }

        // ビンゴ判定（斜め）
        if(cardNumber[1][1].equals("×")){
            if( cardNumber[0][0].equals("×")  && cardNumber[2][2].equals("×") ){
                judge = "Yes";
            }

            if( cardNumber[0][2].equals("×")  && cardNumber[2][0].equals("×") ){
                judge = "Yes";
            }
        }

        // 出力
        System.out.println(judge);
    }
}