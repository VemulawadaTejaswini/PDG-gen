import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
	//char配列に入れる[a][a][b][b]
    char[] array = scanner.next().toCharArray();
	
    //被りカウンター
    int count = 0;

    for(int i = 0; i < array.length; i++) {
      for(int l = 0; l < array.length; l++) {
        //同じ場所を評価しない
        if(i == l) {
          continue;
        }
        //被りがあれば１代入
        count += array[i] == array[l] ? 1 : 0;
      }
    }
    System.out.println(count == 4 ? "Yes" : "No");

    scanner.close();
  }
}