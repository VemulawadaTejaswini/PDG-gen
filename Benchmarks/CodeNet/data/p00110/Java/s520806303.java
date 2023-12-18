import java.util.*;
import java.math.BigInteger;


class Data{
	public BigInteger i,x;
	public Data(int j, int k) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツコツδ督スツトツδ可クツタツーツ・ツスツタツブ
		i=BigInteger.valueOf(j);
		x=BigInteger.valueOf(k);

	}
	public void Batter(BigInteger num,BigInteger xin){
		i=num;
		x=xin;
	}
}

public class Main {
	public static String str;
	public static Data l,m,r;
	public static int pos;
	public static BigInteger x,i;
	public static Data getnum(){
		Data ret=new Data(0,0);
		while(pos<str.length() && str.charAt(pos)!='+' && str.charAt(pos) !='='){
			ret.x=ret.x.multiply(BigInteger.valueOf(10));
			ret.i=ret.i.multiply(BigInteger.valueOf(10));
			if(str.charAt(pos)=='X'){
				ret.x=ret.x.add(BigInteger.valueOf(1));
			}else{
				ret.i=ret.i.add(BigInteger.valueOf(str.charAt(pos)-'0'));
			}
			++pos;
		}
		++pos;
		return ret;
	}

	public static void main(String[] args){
		Scanner cin= new Scanner(System.in);
		while(cin.hasNext()){
			pos=0;
			str=cin.next();
			l=getnum();
			m=getnum();
			r=getnum();

			/*System.out.println(l.i.toString()+" "+l.x.toString());
			System.out.println(m.i.toString()+" "+m.x.toString());
			System.out.println(r.i.toString()+" "+r.x.toString());*/

			i=l.i.add(m.i.subtract(r.i));
			x=r.x.subtract(l.x.add(m.x));

			//System.out.println(i.toString()+" "+x.toString());

			int ans;
			for(ans=0;ans<10;ans++){
				if(i.equals(x.multiply(BigInteger.valueOf(ans)))){
					break;
				}
			}
			if(ans==10)System.out.println("NA");
			else System.out.println(ans);


		}
	}
}