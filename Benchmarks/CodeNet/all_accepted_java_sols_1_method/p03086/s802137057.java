import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//文字列
      	String str = sc.next();
      	//カウント用
      	int count = 0;
      	//カウント最大値入れ物
      	int res = 0;
      	//String regex = "A|C|G|T";
      	//Pattern p = Pattern.compile(regex);
      	for(int i = 0; i < str.length(); i++){
      	//Matcher m = p.matcher(str.charAt(i));

          //if (m.find()){
          if(str.charAt(i) == 'A' || str.charAt(i) == 'T' || str.charAt(i) == 'G' || str.charAt(i) == 'C'){
            count++;
          }else{
          	count =0;
          }
            res = Math.max(count,res);
          }
      	System.out.println(res);
        
     }
}