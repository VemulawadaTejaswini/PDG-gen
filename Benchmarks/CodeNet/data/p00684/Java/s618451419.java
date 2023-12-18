import java.util.Scanner;

//Calculation of Expressions
public class Main{

	public static class I{
		public int real;
		public int img;
		public I(int real, int img) {
			this.real = real;
			this.img = img;
		}
		public boolean valid(){
			return Math.abs(real) <= 10000 && Math.abs(img) <= 10000;
		}
		public I plus(I i){
			return new I(real+i.real, img+i.img);
		}
		public I sub(I i){
			return new I(real-i.real, img-i.img);
		}
		public I mul(I i){
			return new I(real*i.real-img*i.img, real*i.img+img*i.real);
		}
		@Override
		public String toString() {
			if(real==0&&img==0)return "0";
			StringBuilder sb = new StringBuilder();
			sb.append(real==0?"":real);
			if(img>0)sb.append(real==0?img+"i":"+"+img+"i");
			else sb.append(img!=0?img+"i":"");
			return sb.toString();
		}
	}

	public static char[] s;
	public static int id;
	public static boolean overflow;

	public static char c(){
		return s[id++];
	}

	public static I exp(){
		I ans = term();
		while(true){
			char c = c();
			if(c=='+'){
				I i = term();
				ans = ans.plus(i);
				if(!ans.valid())overflow=true;
			}
			else if(c=='-'){
				I i = term();
				ans = ans.sub(i);
				if(!ans.valid())overflow=true;
			}
			else {
				id--;
				break;
			}
		}
		return ans;
	}

	public static I term(){
		I ans = fact();
		while(true){
			char c = c();
			if(c=='*'){
				I i = fact();
				ans = ans.mul(i);
				if(!ans.valid())overflow = true;
			}
			else {
				id--;
				break;
			}
		}
		return ans;
	}

	public static I fact(){
		char c = c();
		if(c=='('){
			I ans = exp();
			c();
			return ans;
		}
		else if(c=='i')return new I(0, 1);
		int x = c-'0';
		while(true){
			c = c();
			if(!Character.isDigit(c))break;
			x *= 10;
			x += c-'0';
		}
		id--;
		return new I(x, 0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			s = (sc.next()+"=").toCharArray();
			id = 0;
			overflow = false;
			I a = exp();
			System.out.println(overflow?"overflow":a);
		}
	}
}