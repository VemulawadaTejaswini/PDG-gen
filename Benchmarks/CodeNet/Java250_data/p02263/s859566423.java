import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
class Main{

	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int peak = 0;
		int returnNumber = 0;
		mathClass keisan =new mathClass();
		ArrayList<String> stack = new ArrayList<String>();
		stack.add("??§?¨?0 ??????????????´??????");
		while(scan.hasNext()){
			stack.add(scan.next());
			peak += 1;

			//??\??????????????????????????£???????¨?????????????
			if(stack.get(peak).equals("+") || stack.get(peak).equals("-") || stack.get(peak).equals("*") || stack.get(peak).equals("/")){
				returnNumber = keisan.shisokuEnzan(stack.get(peak-2),stack.get(peak-1),stack.get(peak));
//				System.out.println(returnNumber);
				//?????£?????????????????????????¨???????????????\??????
				stack.remove(peak);
				stack.remove(peak-1);
				stack.remove(peak-2);
				stack.add(String.valueOf(returnNumber));
				peak -= 2;
			}
//			System.out.println("While");
		}
		System.out.println(stack.get(peak));
	}
}
class mathClass{

	public mathClass(){

	}

	//?????????????????????
	public int shisokuEnzan(String stringX,String stringY,String op){
		int ret =0;
		int x =Integer.parseInt(stringX);
		int y =Integer.parseInt(stringY);
//		System.out.println(x+" "+op+" "+y+" wo okonau");

		if(op.charAt(0) == '+'){
			ret = x + y;
		}
		if(op.charAt(0) == '-'){
			ret = x - y;
		}
		if(op.charAt(0) == '*'){
			ret = x * y;
		}
		if(op.charAt(0) == '/'){
			ret = x / y;
		}
		return ret;
	}

	//???????????¨?????????
	public void disp(int[] ary){
		for(int i=0;i<ary.length;i++){
			System.out.println(ary[i]);
		}
	}

}