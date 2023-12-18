import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int taroScore=0;
		int hanakoScore=0;

		for(int i=0;i<t;i++){
			String taro=sc.next();
			String hanako=sc.next();
			if(taro.compareTo(hanako)==0){
				taroScore++;
				hanakoScore++;
			}else if(taro.compareTo(hanako)>0){
				taroScore+=3;
			}else{
				hanakoScore+=3;
			}
		}
		System.out.println(taroScore+" "+hanakoScore);
	}
}