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
				if(ss[0].charAt(0)=='0' ||ss[1].charAt(0) == '0' ||ss[2].charAt(0) == '0'){
					continue;
				}
				if(xc(ss[0],X,i) + xc(ss[1],X,i) == xc(ss[2],X,i)){
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
	static int xc(String s,String X ,int i){
		String s1 = s.replaceAll(X,Integer.toString(i));
		return Integer.parseInt(s1);
	}

}