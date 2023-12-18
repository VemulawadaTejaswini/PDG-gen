
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int r = cin.nextInt();
			int p = cin.nextInt();
			if(r+p==0){
				break;
			}
			Rule[] rule=new Rule[r];
			Pack[] pack=new Pack[p];
			for(int i = 0;i<r;i++){
				String s1 = cin.next();
				String s2 = cin.next();
				String s3 = cin.next();
				rule[i]=new Rule(s1,s2,s3);
			}
			for(int i = 0;i<p;i++){
				String s1 = cin.next();
				String s2 = cin.next();
				String s3 = cin.next();
				pack[i]=new Pack(s1,s2,s3);
			}
			for(int i = 0;i<p;i++){
				for(int j = 0;j<r;j++){
					if(rule[j].type==2&&pack[i].isPermitted){
						pack[i].isPermitted=rule[j].deny(pack[i]);
					}
				}
			}
			for(int i = 0;i<p;i++){
				for(int j = 0;j<r;j++){
					if(rule[j].type==1&&pack[i].isPermitted){
						pack[i].isPermitted=rule[j].permit(pack[i]);
					}
				}
			}
			int cnt=0;
			for(int i = 0;i<p;i++){
				if(pack[i].isPermitted){
					cnt++;
					
				}
			}
			System.out.println(cnt);
			for(int i = 0;i<p;i++){
				if(pack[i].isPermitted){
					System.out.println(pack[i]);
				}
			}
		}
	}
}
class Rule{
	int type;//1==permit 2==deny
	String source;
	String dest;
	boolean permit(Pack p){
		boolean res = true;
		for(int i = 0;i<8;i++){
			if(source.charAt(i)=='?'){
				continue;
			}
			if(source.charAt(i)!=p.source.charAt(i)){
				res = false;
			}
		}
		for(int i = 0;i<8;i++){
			if(dest.charAt(i)=='?'){
				continue;
			}
			if(dest.charAt(i)!=p.dest.charAt(i)){
				res = false;
			}
		}
		return res;
	}
	boolean deny(Pack p){
		boolean res=false;
		for(int i = 0;i<8;i++){
			if(source.charAt(i)=='?'){
				continue;
			}
			if(source.charAt(i)!=p.source.charAt(i)){
				res = true;
			}
		}
		for(int i = 0;i<8;i++){
			if(dest.charAt(i)=='?'){
				continue;
			}
			if(dest.charAt(i)!=p.dest.charAt(i)){
				res = true;
			}
		}
		return res;
	}
	Rule(String s1,String s2,String s3){
		if(s1.equals("permit")){
			type=1;
		}
		else{
			type=2;
		}
		source=s2;
		dest=s3;
	}
}
class Pack{
	String source;
	String dest;
	String body;
	boolean isPermitted=true;
	Pack(String s1,String s2,String s3){
		source=s1;
		dest=s2;
		body=s3;
		isPermitted=true;
	}
	public String toString(){
		return source+" " +dest+" " +body;
	}
}