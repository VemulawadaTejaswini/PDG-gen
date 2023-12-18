import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] balance={1,2,4,8,16,32,64,128,256,512};
		while(sc.hasNext()){
			String strW=Integer.toBinaryString(sc.nextInt());
			char[] cW=strW.toCharArray();
			boolean flag=false;
			for(int i=0;i<cW.length;i++){
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