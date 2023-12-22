import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
  	static Gcd gc;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
      	int result = 0;
        gc = new Gcd();
      	for(int i=1;i<=num;i++){
          for(int j=1;j<=num;j++){
            int tmp = gc.gcd(i,j);
            for(int k=1;k<=num;k++){
         		//最初の2数の最大公約数を取得
      			result += gc.gcd(tmp,k);
            }
          }
        }
      System.out.println(result);
    }
}

class Gcd{
	public int gcd(int a,int b){
  		int tmp = 0;
  		int amari=-1;
  		if(a>=b){
    		tmp = a;
    		a = b;
  		}else{
    		tmp = b;
  		}

 		 while(amari != 0){
    		amari = a%tmp;
           	a = tmp;
           	tmp = amari;
  		 }
  		return a;
	}
}