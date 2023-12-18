import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] balance={512,256,128,64,32,16,8,4,2,1};
		while(sc.hasNext()){
			String strW=Integer.toBinaryString(sc.nextInt());
			int length=strW.length();
			for(int i=0;i<balance.length-length;i++){
				strW="0"+strW;
			}
			char[] cW=strW.toCharArray();
			boolean flag=false;
			for(int i=cW.length-1;i>=0;i--){
				if(Character.toString(cW[i]).equals("1")){
					if(flag){
						System.out.print(" "+balance[i]);
					}else{
						System.out.print(balance[i]);
						flag=true;
					}
				}
			}
			System.out.println();
		}
	}
}