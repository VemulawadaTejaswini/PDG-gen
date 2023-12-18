 import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		// 整数の入力
    		char[] ca = sc.next().toCharArray();
                boolean res = false;
                for(int i=0; i<ca.length; i++){
                    for(int j=i+1; j<ca.length; j++){
                        if(ca[i] == ca[j]){
                            res = true;
                        }
                    }
                }
    		System.out.println(res?"no":"yes");
    	}
    }

