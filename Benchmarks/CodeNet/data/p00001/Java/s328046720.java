import java.util.Arrays;

public class Main
{
	public static void main( String[] args ) {
		int[] array = {1819,2003,876,2840,1723,1673,3776,2848,1592,922};
//		int one;
//		int two;
//		int three;
//		int four;
//		int five;
//		int six;
//		int seven;
//		int eight;
//		int nine;
//		int ten;
//
//		int[] array = {one,two,three,four,five,six,seven,eight,nine,ten};
//		highest_mountain(mount);
		Arrays.sort(array);
		int count = 0;
		for(int i = array.length-1;i>0;i--){
			if(0 <= array[i] && array[i] <= 10000){
				System.out.println(array[i]);
				count++;
			}
			if(count ==3){
				break;
			}
		}
	}
	public static void highest_mountain(int[] array){
		Arrays.sort(array);
		int count = 0;
		for(int i = array.length-1;i>0;i--){
			if(0 <= array[i] && array[i] <= 10000){
				System.out.println(array[i]);
				count++;
			}
			if(count ==3){
				break;
			}
		}
	}
}