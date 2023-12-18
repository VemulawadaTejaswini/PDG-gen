import java.util.Scanner;

public class Main {

  	class Item {
      String pattern = "";
      int score = 0;
    }
  
  
	public static void main(String[] args) {
      
      	Main main = new Main();
      	main.run();
    }
  
  	void run() {
    	Scanner sc = new Scanner(System.in);
    	String answer = sc.nextLine(); 
      	StringBuilder result = new StringBuilder();

      	int sum = 0;
      	result.append("");
        
      	Item item = new Item();
       
      	while (!answer.equals(item.pattern)) {
          	item = testString(answer, result);
      		sum += item.score;
          	result = new StringBuilder(item.pattern);
        }
      	
      
		System.out.println(result + "," + sum);
     
    }      
  
  	//得点の高いパターンを返す
  	Item testString(String answer, StringBuilder result) {
      	Item item = new Item();
      	for (int i = result.length() ; i >= 0; i--) {
          	for (int v = 1; v >= 0; v-- ) {
              StringBuilder test = new StringBuilder(result);
              test.insert(i, String.valueOf(v));
              
              //存在する文字の場合
              if (answer.indexOf(test.toString()) >= 0) {
                //合計
                int testSum = checkSum(test.toString());
                if (item.score < testSum) {
                  item.pattern = test.toString();
                  item.score = testSum;
                }
              }
            }
        }
      	return item;
    }
  
  	//奇数の数字を足す
  	int checkSum(String val) {
      int r = 0;
      for (int i = 0; i < val.length(); i+=2) {
        r += Integer.parseInt(val.substring(i, i+1));
      }
      return r;
    }
}