import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		Digital digital;
		
		while(true){
			line = br.readLine();
			int num = Integer.valueOf(line);
			if(num == -1){
				break;
			}
			digital = DigitalType.NN.getDigital();

			int sig;
			Digital digNum;
			for(int i = 0; i < num; i++){
				line = br.readLine();
				sig = Integer.valueOf(line);
				
				digNum = DigitalType.getDigitalFromNumber(sig);
				System.out.println(getDiffSignal(digital, digNum));
				digital = digNum;
			}
		}
	}
	
	private static String getDiffSignal(Digital dig1, Digital dig2){
		String result = "";
		result = result + getDiff(dig1.getG(), dig2.getG());
		result = result + getDiff(dig1.getF(), dig2.getF());
		result = result + getDiff(dig1.getE(), dig2.getE());
		result = result + getDiff(dig1.getD(), dig2.getD());
		result = result + getDiff(dig1.getC(), dig2.getC());
		result = result + getDiff(dig1.getB(), dig2.getB());
		result = result + getDiff(dig1.getA(), dig2.getA());
		return result;
	}
	
	private static String getDiff(int num1, int num2){
		if(num1 == num2){
			return "0";
		}else{
			return "1";
		}
	}
	
	private enum DigitalType{
		NN(-1, "00000000"),
		N0(0, "0111111"),
		N1(1, "0000110"),
		N2(2, "1011011"),
		N3(3, "1001111"),
		N4(4, "1100110"),
		N5(5, "1101101"),
		N6(6, "1111101"),
		N7(7, "0100111"),
		N8(8, "1111111"),
		N9(9, "1101111");

		private int number;
		private Digital digital;
		
		DigitalType(int number, String signal){
			this.number = number;
			this.digital = new Digital(signal);
		}
		
		public Digital getDigital(){
			return digital;
		}
		
		public int getNumber() {
			return number;
		}

		public static Digital getDigitalFromNumber(int num){
			for(DigitalType type : DigitalType.values()){
				if(type.getNumber() == num) return type.getDigital();
			}
			return null;
		}
	}
	
	private static class Digital {
		Integer g = 0,f = 0,e = 0,d = 0,c = 0,b = 0,a = 0;
		
		public Digital(String sig){
			setSignal(sig);
		}
		
		public void setSignal(String sig){
			String[] nums = sig.split("");
			g = getNumber(g, Integer.parseInt(nums[0]));
			f = getNumber(f, Integer.parseInt(nums[1]));
			e = getNumber(e, Integer.parseInt(nums[2]));
			d = getNumber(d, Integer.parseInt(nums[3]));
			c = getNumber(c, Integer.parseInt(nums[4]));
			b = getNumber(b, Integer.parseInt(nums[5]));
			a = getNumber(a, Integer.parseInt(nums[6]));
		}
		
		private int getNumber(Integer target, Integer num){
			if(target == 0){
				if(num == 1) return 1;
			}else{
				if(num == 1) return 0;
			}
			return target;
		}

		public Integer getG() {
			return g;
		}

		public Integer getF() {
			return f;
		}

		public Integer getE() {
			return e;
		}

		public Integer getD() {
			return d;
		}

		public Integer getC() {
			return c;
		}

		public Integer getB() {
			return b;
		}

		public Integer getA() {
			return a;
		}
	}

}