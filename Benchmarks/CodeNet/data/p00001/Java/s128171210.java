import java.util.*;

public class Main{
	public static void main(String[] args) {
		solve0001();
	}
	public static void solve0001() {
		Integer[] array=new Integer[10];
		Scanner sc = new Scanner(System.in); 
		
		for(int i=0; i < 10; i++){
			array[i] = new Integer(sc.nextInt());
		} 
		Arrays.sort(array,new MyComparator());
		for(int i = 0;i < 3;i++){
			System.out.println(array[i]); 
		}
	}
}
class MyComparator implements Comparator<Integer>{
	public int compare(Integer o1,Integer o2){
		return o1.intValue()<o2.intValue()?1:-1;
	}
}