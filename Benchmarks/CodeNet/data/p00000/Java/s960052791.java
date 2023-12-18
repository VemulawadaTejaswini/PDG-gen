import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	void to(){
		for(int i=1; i<10; i++){
			for(int j=1; j<10; j++){
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
	}
	
	public static void main(String[]agrs){
		new Main().to();
	}
}