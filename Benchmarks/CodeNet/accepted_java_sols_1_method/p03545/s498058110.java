import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String ss = sc.next();
		int[] num = new int[4];
		for( int i=0; i<4; i++ ){
			String str = String.valueOf(ss.charAt(i));
			num[i] = Integer.parseInt(str);
		}
		for( int i=0; i<1; i++ ){
			if( num[0]+num[1]+num[2]+num[3]==7 ){
				System.out.println(num[0]+"+"+num[1]+"+"+num[2]+"+"+num[3]+"=7");
				break;
			}
			if( num[0]+num[1]-num[2]+num[3]==7 ){
				System.out.println(num[0]+"+"+num[1]+"-"+num[2]+"+"+num[3]+"=7");
				break;
			}
			if( num[0]+num[1]+num[2]-num[3]==7 ){
				System.out.println(num[0]+"+"+num[1]+"+"+num[2]+"-"+num[3]+"=7");
				break;
			}
			if( num[0]+num[1]-num[2]-num[3]==7 ){
				System.out.println(num[0]+"+"+num[1]+"-"+num[2]+"-"+num[3]+"=7");
				break;
			}
			if( num[0]-num[1]+num[2]+num[3]==7 ){
				System.out.println(num[0]+"-"+num[1]+"+"+num[2]+"+"+num[3]+"=7");
				break;
			}
			if( num[0]-num[1]-num[2]+num[3]==7 ){
				System.out.println(num[0]+"-"+num[1]+"-"+num[2]+"+"+num[3]+"=7");
				break;
			}
			if( num[0]-num[1]+num[2]-num[3]==7 ){
				System.out.println(num[0]+"-"+num[1]+"+"+num[2]+"-"+num[3]+"=7");
				break;
			}
			if( num[0]-num[1]-num[2]-num[3]==7 ){
				System.out.println(num[0]+"-"+num[1]+"-"+num[2]+"-"+num[3]+"=7");
				break;
			}
		}
	}
}
