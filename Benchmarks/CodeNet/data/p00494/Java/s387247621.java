import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String s=cin.next();
		String J="J";
		String O="O";
		String I="I";
		int ans=0;
		for(int i=1;;i++){
			if(i*3>s.length())break;
			int jj=s.indexOf(J);
			if(jj<0)break;;
			int oo=s.indexOf(O);
			if(oo<0)break;
			int ii=s.indexOf(I);
			if(ii<0)break;
//			if(jj+i==oo&&oo+i==ii){
			if(s.indexOf(J+O+I)>=0){
				ans=i;
			}
			J+="J";
			O+="O";
			I+="I";
		}
		System.out.println(ans);
	}

}