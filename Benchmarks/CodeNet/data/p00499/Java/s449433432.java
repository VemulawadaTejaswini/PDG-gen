import java.util.*;
public class Main{
	int page;
	int max;
	boolean flg = true;
	void doIt(){
		Scanner sc = new Scanner(System.in);
        int l,ans = 0;
        l = sc.nextInt();
        Main ko = new Main();
        Main su = new Main();
        ko.page =sc.nextInt();
        su.page =sc.nextInt();
        ko.max =sc.nextInt();
        su.max =sc.nextInt();
        while(ko.flg || su.flg){
            ko.study();
            su.study();
            ans ++;
        }
        System.out.println(l - (ans));
	}
	public void study(){
	        this.page -= this.max;
	        if(this.page <=0){
	            this.page = 0;
	            this.flg = false;
	        }
	    }
	public static void main(String[] args){
		new Main().doIt();
	}
}