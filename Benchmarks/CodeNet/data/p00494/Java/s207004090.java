import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String s=cin.next();
		String JOI="JOI";
		int ans=0;
		for(int i=1;;i++){
			if(i*3>s.length())break;
			if(s.indexOf(JOI)!=-1){
				ans=i;
			}
			JOI="J"+JOI.substring(0,JOI.length()/2)+"O"+JOI.substring(JOI.length()/2)+"I";
//			System.out.println(JOI);
		}
		System.out.println(ans);
	}

}