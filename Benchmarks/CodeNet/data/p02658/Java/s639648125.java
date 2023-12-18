import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
      	int tmpVal = 0;
      	int limit = kaizyo(10,18);
        for(int i=0;i<cnt;i++){
			int tmpInput = sc.nextInt();
          if((tmpInput * tmpVal) >  limit) {
            tmpVal = -1;
            break;
          } else {
          	tmpVal = (tmpInput * tmpVal);
          }
        }
		// 出力
		System.out.println(tmpVal);
	}
    private static int kaizyo(int val,int n){
      int tmpVal = val;
      for(int i=0;i<n;i++){
       	 tmpVal = tmpVal*val;
      }
      return tmpVal;
	}
}