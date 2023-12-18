import java.util.Scanner;
public class Main.278{
	
    public void solve(){
		Scanner sc=new Scanner(System.in);
		int hito,i,ban,uriage;
		for(int a=0; a<4;a++){
			ban=sc.nextInt();
			if(ban==1){
				i=6000;
				}else if(ban ==2){
					i=4000;
				}else if(ban ==3){
					i=3000;
				}else{
					i=2000;
				}
				hito=sc.nextInt();
				uriage=i*hito;
				System.out.println(uriage);
		
			 }
    }
      public static void main(String[] args){
      Main obj = new  Main.278(); 
      obj.solve();      
  }
}