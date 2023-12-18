import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int teki = sc.nextInt();
		int waza = sc.nextInt();
      	long ret = 0;
      	int[] hoge = new int[teki];
      	if (teki <= waza){
        	System.out.println(0);
          	return;
        }
		for (int i = 0; i < teki; i++){
			hoge[i] = sc.nextInt();
		}
		Arrays.sort(hoge);
		for(int i = 0; i < teki - waza ; i++){
          	ret += hoge[i];
		}
		System.out.print(ret);
	}
}