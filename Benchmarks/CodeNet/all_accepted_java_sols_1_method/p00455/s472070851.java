import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(int i=0;i<3;i+=1){
			int sah,sam,sas,fah,fam,fas,h,m,s;
			sah=cin.nextInt();
			sam=cin.nextInt();
			sas=cin.nextInt();
			fah=cin.nextInt();
			fam=cin.nextInt();
			fas=cin.nextInt();
			h=fah-sah;
			m=fam-sam;
			s=fas-sas;
			if(s<0){
				s=s+60;
				m=m-1;
			}
			if(m<0){
				m=m+60;
				h=h-1;
			}
			System.out.println(h+" "+m+" "+s);
		}
	}
}