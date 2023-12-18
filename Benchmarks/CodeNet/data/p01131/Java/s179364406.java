import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int setnum, btncnt;
		String[] btn = {"",".,!? ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		String numString, tmpstring/*, message*/;

		setnum = scanner.nextInt();

		for(int i = 0; i < setnum; i++){
			/*message = "";*/
			tmpstring = "";
			numString = scanner.next();
			for(int j = 0;j < numString.length() ;j++){
				if((Integer.parseInt(numString.charAt(j) + "")) == 0){
					System.out.print(tmpstring);
					tmpstring = "";
				}else if(Integer.parseInt(numString.charAt(j) + "") > 0){
					btncnt = 0;
					int hoge = Integer.parseInt(numString.charAt(j) + "");
					while(hoge == Integer.parseInt(numString.charAt(j)+ "")){
						j++;
						btncnt++;
					}
					System.out.print(btn[hoge].charAt((btncnt - 1) % btn[hoge].length()));
				}
			}
			System.out.println();
		}
	}
}