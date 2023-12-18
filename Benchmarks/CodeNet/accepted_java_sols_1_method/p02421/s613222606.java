import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		String taro,hana;
		int tp=0,hp=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			taro=sc.next();
			hana=sc.next();
			if(taro.compareTo(hana)==0){
				tp+=1;
				hp+=1;
			}else if(taro.compareTo(hana)>0)tp+=3;
			else hp+=3;
		}
		System.out.println(tp+" "+hp);
	}
}