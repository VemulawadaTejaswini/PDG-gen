import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
			//?????????????????????

	    Scanner scan = new Scanner(System.in);
	    String gyosu = scan.next();
	 	int intgyosu = Integer.parseInt(gyosu);
	 	String[] yesno;
	 	yesno = new String[intgyosu];

	  for(int i = 1; i<=intgyosu; i++){

	    String num1 = scan.next();
	 	int int1 = Integer.parseInt(num1);

	    String num2 = scan.next();
	    int int2 = Integer.parseInt(num2);

	    String num3 = scan.next();
	    int int3= Integer.parseInt(num3);

	    int maxnum = Math.max(int1, int2);
	    int max_num = Math.max(maxnum, int3);

	    boolean hantei = false;

		if(max_num==int1){
	    	hantei =  (int2 * int2) + (int3 * int3) == (int1*int1);
	    }else if(max_num==int2) {
	    	hantei =  (int1 * int1) + (int3 * int3) == (int2*int2);
	    }else if (max_num==int3){
	    	hantei =  (int2 * int2) + (int1 * int1) == (int3*int3);
	    }

		if(hantei){
			 yesno[i-1] = "YES";
		}else{
			yesno[i-1] = "NO";
		}
	  }

	  //????????????
	    scan.close();

	    for(int j =0; j<intgyosu; j++){
	    		System.out.println(yesno[j]);

	}

	}
}