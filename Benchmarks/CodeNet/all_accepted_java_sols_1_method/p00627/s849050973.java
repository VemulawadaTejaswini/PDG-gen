
import java.io.IOException;
import java.util.Scanner;

public class Main {
	private int sumNum;
	private int gyosya;
	private int point=0;
	
	public Main(int gyosya,Scanner in){
		this.gyosya=gyosya/4;
		point=0;
		for(int i=0;i<this.gyosya;i++){
			point+=in.nextInt();
		}
		System.out.println(point);
	}
	public static void main(String[] args)throws IOException{
		int sumNum;
		Scanner in =new Scanner(System.in);
		while(true){
			sumNum=in.nextInt();
			if(sumNum==0){
				break;
			}
			if(sumNum!=0){
				Main main=new Main(sumNum,in);
			}
		}
	}
	
}