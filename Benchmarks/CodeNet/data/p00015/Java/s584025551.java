import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0; i<n;i++){
			StringBuffer a = new StringBuffer(sc.next());
			StringBuffer b = new StringBuffer(sc.next());
			StringBuffer c;
			int UpFlag = 0;
			if(a.length()<b.length()){
				c=a;a=b;b=c;	//a is longer
			}
			a.reverse();
			b.reverse();
			StringBuffer d = new StringBuffer();
			//System.out.print(Integer.parseInt(""+a.charAt(0)) + Integer.parseInt(""+b.charAt(0)));
			for(int j=0; j<b.length();j++){
				int e = Integer.parseInt(""+a.charAt(j))+Integer.parseInt(""+b.charAt(j)) + UpFlag;
				UpFlag = e/10;
				d.append(e%10);
			}
			for(int k=b.length(); k<a.length();k++){
				int e = Integer.parseInt(""+a.charAt(k))+UpFlag;
				UpFlag = e/10;
				d.append(e%10);
			}
			if(d.length()==80&&UpFlag==1){
				System.out.println("overflow");
			} else {
				if(UpFlag==1) d.append(1);
				d.reverse();
				System.out.println(d.toString());
			}
		}
	}

}