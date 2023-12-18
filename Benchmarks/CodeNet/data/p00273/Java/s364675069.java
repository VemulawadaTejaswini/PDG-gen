import java.util.Scanner;
class Main{

    public void solve(){
        Scanner sc = new Scanner(System.in);
        int nissu, nyuumai, pumai;
        double nyuuryou, puryou, total;
        nissu = sc.nextInt();
        int num = 1;
       while(num <= nissu){
    	   nyuuryou = sc.nextInt();
    	   puryou = sc.nextInt();
    	   nyuumai = sc.nextInt();
    	   pumai = sc.nextInt();

    	   if(nyuumai >= 5 && pumai >= 2){
    		   nyuuryou = nyuuryou - nyuuryou * 0.2;
    		   puryou = puryou - puryou * 0.2;
    	   }


    	   total = (nyuuryou * nyuumai) + (puryou * pumai);
    	   System.out.println((int)total);
    	   num += 1;



       }

    }

    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}