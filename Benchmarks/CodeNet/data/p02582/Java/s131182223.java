import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    //入力する変数
    String S;
    
    //R(雨の日)が連続した日数
    int count = 0;
    
    //入力する文字列
   	S = scanner.next();
        
    //入力した変数を一文字ずつ分割して格納する
    String[] strArray = new String[3];
    
    //文字列を分割してstrArrayにそれぞれ格納する
    for(int i=0; i<S.length(); i++){
		String str = String.valueOf(S.charAt(i));
      	strArray[i] = str;
    }
    
    //ここから雨の連続日数を数える
    //1日(以上)雨だとcountに1を代入する
    for(int j=0; j<S.length(); j++){
      	if(strArray[j] == "R"){
          	count = 1;
        }
    }
    //2日連続雨だとcountに2代入する
    if(strArray[0] == "R" && strArray[1] == "R"){
      	count = 2;
    }
    else if(strArray[1] == "R" && strArray[2] == "R"){
      	count = 2;
    }
    //3日雨だとcountに3代入する
    int tmp = 0;
    for(int k=0; k<S.length(); k++){
     	if(strArray[k] == "R"){
         	tmp++;
        }
    }
    if(tmp == 3){
     	count = 3; 
    }
    
    //何連続雨だったか出力する
    System.out.println(count);
    
    
  }
}