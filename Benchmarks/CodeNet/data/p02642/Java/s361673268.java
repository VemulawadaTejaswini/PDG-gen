import java.util.Scanner;
import java.util.HashSet;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	HashSet<Integer> a = new HashSet<>();
	HashSet<Integer> doubleList = new HashSet<>();
	int n = sc.nextInt();
	int maxValue = 0;
	for(int i=0;i<n;i++){
	    int x = sc.nextInt();
	    if(maxValue<x){
		maxValue = x;
	    }
	    boolean addable = true;
	    for(int j=2;j<x;j++){
		//因数がリストにあったら追加しない
		if(x%j==0){
		    if(a.contains(j)){
			addable = false;
		    }
		}
	    }
	    //xがリストにあったらdoubleListに登録
	    if(a.contains(x)){
		doubleList.add(x);
		addable = false;
	    }
	    //因数がListになければListに追加
	    if(addable){
		a.add(x);
	    }
	    //xを因数とする数値の削除
	    for(int j=x+1;j<=maxValue;j++){
		if(j%x==0){
		    if(a.contains(j)){
			a.remove(j);
			if(doubleList.contains(j)){
			    doubleList.remove(j);
			}
		    }
		}
	    }
	}
	System.out.println(a.size()-doubleList.size());
	sc.close();
      }
}
