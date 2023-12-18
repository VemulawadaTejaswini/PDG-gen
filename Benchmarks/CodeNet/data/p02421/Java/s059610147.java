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
			if(taro==hana){
				tp+=1;
				hp+=1;
			}else{
				for(int j=0;j<Math.min(taro.length(),hana.length());j++){
					if(taro.charAt(j)>hana.charAt(j)){
						tp+=3;
						break;
					}else if(taro.charAt(j)<hana.charAt(j)){
						hp+=3;
						break;
					}
				}
			}
		}
		System.out.println(tp+" "+hp);
	}
}