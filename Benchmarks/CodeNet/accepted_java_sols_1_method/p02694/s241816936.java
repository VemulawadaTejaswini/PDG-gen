import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long ret = 100;
		for(int i = 1;;i++){
			ret += ret * 0.01;
			if(ret >= a){
				System.out.print(i);
				break;
			}
		}
	}
}