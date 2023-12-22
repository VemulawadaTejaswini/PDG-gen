import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            int ret = 0;
            
            for(int i=0; i<n; i++){
            	ret += (d-1)/Integer.parseInt(sc.next()) + 1;
            }
            
            //出力
            System.out.println(ret + x);
            sc.close();
        }
    }
	