import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
      	int[] array = new int[S.length()-2];
      	for(int i=0;i<S.length()-2;i++){
        	array[i] = Integer.parseInt(S.substring(i,i+3));
          	array[i] = Math.abs(array[i]-753);
        }
      	Arrays.sort(array);
      	System.out.println(array[0]);
    }
}