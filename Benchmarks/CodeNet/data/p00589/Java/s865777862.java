import java.util.Scanner;

class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String one = ",,.,!?";
		String two = "abcABC";
		String three = "defDEF";
		String four = "ghiGHI";
		String five = "jklJKL";
		String six = "mnoMNO";
		String seven = "pqrsPQRS";
		String eight = "tuvTUV";
		String nine = "wxyzWXYZ";
		String zero = " ";
		
		while(sc.hasNext()){
			String ans = "";
			String line = sc.next();
			int n = 0;
			while(line.length() > n){
				int count = 0;
				while(n + 1 != line.length() && line.charAt(n) == line.charAt(n + 1)){
					count++;
					n++;
				}
				String temp = "";
				if(line.charAt(n) == '1')
					temp = one;
				else if(line.charAt(n) == '2')
					temp = two;
				else if(line.charAt(n) == '3')
					temp = three;
				else if(line.charAt(n) == '4')
					temp = four;
				else if(line.charAt(n) == '5')
					temp = five;
				else if(line.charAt(n) == '6')
					temp = six;
				else if(line.charAt(n) == '7')
					temp = seven;
				else if(line.charAt(n) == '8')
					temp = eight;
				else if(line.charAt(n) == '9')
					temp = nine;
				else if(line.charAt(n) == '0')
					temp = zero;
				if(temp == zero){
					if(count >= 1){
						for(int k = 0; k < count; k++){
							ans += " ";
						}
					}
				}else{
					ans += temp.charAt(count % temp.length());
				}
				n++;
			}
			System.out.println(ans);
		}
	}

}