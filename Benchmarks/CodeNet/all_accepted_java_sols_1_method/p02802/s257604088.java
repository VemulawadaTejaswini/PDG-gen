import java.util.Scanner;

public class Main{
	//N問出題　M回提出　
	//i回目はp[i]番の問題　結果はS[i]="AC"or"WA"
	//正答数はS[i]=ACの問題数の合計
	//ペナルティ数は↑でACになるまでに出したWAの合計
	//正答数とペナルティ数を答える
	//
	//iのときにACが出るまでforでPにカウント、
	//ACが出たらSにカウントしてi++→i+1の数字の場合、同様の処理を行う
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    int p = 0;
    String S= null;
    String check[] = new String[N+1];
    for(int i=1; i<=N; i++){
      check[i]="";
    }
    int sumP[] = new int[N+1];
    for(int i=1; i<=N; i++){
      sumP[i]=0;
    }
    int resultP = 0;
    int resultS = 0;

    if(M>0){
    for(int i=1; i<=M; i++){
    	p = scan.nextInt();
    	S = scan.next();
    	if(!(check[p].equals("AC")) && S.equals("WA")) {
    		sumP[p]++;
    	}else if(!(check[p].equals("AC")) && S.equals("AC")){
    		resultS++;
    		check[p] = "AC";
    	}
    }
      for(p=1; p<=N; p++){
        if(check[p].equals("AC")){
        	resultP = resultP + sumP[p];
        }
      }
    }
    System.out.println(resultS+" "+resultP);
  }
}