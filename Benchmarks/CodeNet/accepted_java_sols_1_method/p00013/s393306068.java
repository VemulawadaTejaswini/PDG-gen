import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> train=new ArrayList<Integer>();
		int n;
		while(sc.hasNext()){
			if((n=sc.nextInt())!=0) train.add(n);
			else{	//末尾を出力、削除
				int size=train.size()-1;
				System.out.println(train.get(size));
				train.remove(size);
			}
		}
	}
}