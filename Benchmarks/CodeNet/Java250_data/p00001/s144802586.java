import java.util.*;


public class Main {
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		Integer[] mount = new Integer[10];
		int i = 0;
		while(sc.hasNext()){
			mount[i] = sc.nextInt();
			i++;
		}
		sort(mount);
		sc.close();
	}
	public static void sort(Integer[] mlist){
		Arrays.sort(mlist);
		for(int i=9; i >= 7; i--){
			System.out.println(mlist[i]);
		}
	}
	
}