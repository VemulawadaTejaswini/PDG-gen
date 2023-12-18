//«Åå«¢àÌªÒÆÈéJ[hQ[ÌvO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int taroPoint = 0;
		int hanakoPoint = 0;
		for(int i=0; i < n ; i++){
			String taro = sc.next();
			String hanako = sc.next();
			boolean flg = true; //¶ñÌ·³Å»f·éÆ«ÌtO
			for(int j=0; j < taro.length() && j < hanako.length(); j++){
				if(taro.charAt(j) > hanako.charAt(j)){
					flg = false;
					taroPoint += 3;
					break;
				}
				else if(taro.charAt(j) < hanako.charAt(j)){
					flg = false;
					hanakoPoint += 3;
					break;
				}
			}
			if(flg){
				if(taro.length() > hanako.length()){
					taroPoint += 3;
				}
				else if(taro.length() < hanako.length()){
					hanakoPoint += 3;
				}
				else{
					//¯_ÌÍ1_
					taroPoint += 1;
					hanakoPoint += 1;
				}
			}
		}
		System.out.println(taroPoint + " " + hanakoPoint);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}