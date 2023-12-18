import java.util.Arrays;

public class Main
{
	public static void main( String[] args ) {
		int[] mount = {1819,2003,876,2840,1723,1673,3776,2848,1592,922};
		Arrays.sort(mount);
		int count = 0;
		for(int i = mount.length-1;i>0;i--){
			if(0 <= mount[i] && mount[i] <= 10000){
				System.out.println(mount[i]);
				count++;
			}
			if(count ==3){
				break;
			}
		}
	}
}