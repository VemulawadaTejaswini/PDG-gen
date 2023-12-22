import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        
        //K番目の文字取得
        String kcha = s.substring(k - 1, k);


        for (int i = 0; i < s.length(); i++){
            String cha = s.substring(i, i + 1);

            if (cha.equals(kcha)) {

            } else {
              
                s = s.replace(cha,"*");
            } 

        }

        System.out.println(s);
     }
}