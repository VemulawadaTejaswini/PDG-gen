import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // int型へ変換
    var N = Integer.parseInt(str_scan);

    String str_scan2 = scan.nextLine();
    // スペース区切りで分ける
    var str = str_scan2.split(" ");

    int L[] = new int[N];
    int ans = 0;

    for (var x = 0; x < N;x++){
      L[x] = Integer.parseInt(str[x]);
    }

    for (var i = 0;i < N-2;i++){
      for (var j = i+1; j < N-1;j++){
        for (var k = j+1; k < N;k++){
          if((L[i] == L[j]) || (L[j] == L[k]) || (L[i] == L[k])){

          }else if ((L[i] < L[j] + L[k]) && (L[j] < L[i] + L[k]) && (L[k] < L[i] + L[j])){
            ans++;
          }
        }
      }
    }

    System.out.println(ans);
    scan.close();
  }
}