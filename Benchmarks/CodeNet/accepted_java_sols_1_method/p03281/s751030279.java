import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

    List<Integer> numList = new ArrayList<Integer>();
    int count = 0;
		for(int i = 1;i<=n;i++){
		  //1からnまでのすべての整数に対して実行
		  if(i%2==0){
		    continue;
		  }
		  for(int j = 1;j<=i;j++){
		    if(i%j==0){
		      //約数があればカウントを増やす
		      count++;
		    }
  		  if(count>8){
  		    //8個以上見つかった段階で次へ
	  	    break;
		    }
		  }
		  if(count==8){
		    numList.add(i);
		  }
		  count = 0;
		}
		System.out.println(numList.size());
	}
}