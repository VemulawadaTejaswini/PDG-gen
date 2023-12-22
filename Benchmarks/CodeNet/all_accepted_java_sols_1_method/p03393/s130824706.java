import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            String s = sc.next(), ret = "";
            Set<Integer> set = new HashSet<>();
            
            for(int i=0; i<s.length(); i++){
            	set.add((int)(s.charAt(i)));
            }
            
            for(int i=97; i<=122; i++){
            	if(!set.contains(i)){
            		System.out.println(s + String.valueOf((char)i));
            		sc.close();
            		return;
            	}
            }
            
            for(int i=25; i>=0; i--){
            	set.remove((int)(s.charAt(i)));
            	for(int j=s.charAt(i)+1; j<=122; j++){
            		if(!set.contains(j)){
            			System.out.println(s.substring(0, i) + String.valueOf((char)j));
            			sc.close();
                        return;
            		}
            	}
            }
            
            //出力
            System.out.println(-1);
            sc.close();
        }
    }
	