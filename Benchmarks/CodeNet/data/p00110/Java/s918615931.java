import java.math.BigDecimal;
import java.util.Scanner;


class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String X = "X";
		final String CLAC = "[+=]";
		final int C = 10;
		int ans = -1;
		Scanner in = new Scanner(System.in);
		while((in.hasNext())){
			String s = in.nextLine();
			String[] ss = s.split(CLAC);
			for(int i=0;i<C;i++){
				if(i == 0){
					if(ss[0].substring(0, 1).equals("X")){
						if(ss[0].length() > 1){
							continue;
						}
					}
					else if(ss[1].substring(0, 1).equals("X")){
						if(ss[1].length() > 1){
							continue;
						}
					}
					else if(ss[2].substring(0, 1).equals("X")){
						if(ss[2].length() > 1){
							continue;
						}
					}
				}
				if(xc(ss[0],X,i).add(xc(ss[1],X,i)).equals(xc(ss[2],X,i))){
					ans = i;
					break;
				}
			}
			if(ans< 0){
				System.out.println("NA");
			}
			else{
				System.out.println(ans);
			}
			ans = -1;
		}

	}
	public static BigDecimal xc(String s,String X ,int i){
		BigDecimal big = new BigDecimal(s.replaceAll(X,Integer.toString(i)).toCharArray());
		return big;
	}

}