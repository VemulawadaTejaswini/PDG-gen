import java.util.Scanner;
public class Main{
	public void output(){
		for(int a=1;a<=9;a++){
			for(int i=1;i<=9;i++){
				System.out.println(a+"x"+i+"="+a*i);
			}
		}
	}
	public static void main(String[] args){
		Main obj = new Main();
		obj.output();
	}
}