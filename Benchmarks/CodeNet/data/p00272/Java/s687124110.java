//2702 青山理恵　問２

import java.util.Scanner;
public class Q0277{
    int syurui[]={6000,4000,3000,2000};
	int num;
    int maisuu;
    int urikin;
    
    public void solve(){
       Scanner sc = new Scanner(System.in);
	   for(int i=1;i<=4;i++){
	   	num = sc.nextInt();
	   	maisuu = sc.nextInt();
	   	System.out.println((syurui[num-1])*maisuu);
	   }
		
    }
    
    public static void main(String[] args){
        Q0277 obj = new Q0277();
        obj.solve();
    }
}