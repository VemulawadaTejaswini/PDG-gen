import java.util.Arrays;

public class Main
{
	public static void main( String[] args ) {
		int[] mount = {1819,2003,876,2840,1723,1673,3776,2848,1592,922};
		Arrays.sort(mount);
		for(int i = mount.length-1;i>mount.length-4;i--){
			System.out.println(mount[i]);
		}
	}
}