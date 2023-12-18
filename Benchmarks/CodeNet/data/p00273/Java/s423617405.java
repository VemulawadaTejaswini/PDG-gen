import java.util.Scanner;
public class Main{
	
    public void solve(){
		Scanner sc=new Scanner(System.in);
		int niti,nyuryo,puluryo,nyumai,pulumai,nyukei,pulukei,goukei;
		niti=sc.nextInt();
		for(int i=0; i<niti; i++){
		nyuryo=sc.nextInt();
		puluryo=sc.nextInt();
		nyumai=sc.nextInt();
		pulumai=sc.nextInt();
		nyukei=nyuryo*nyumai;
		pulukei=puluryo*pulumai;
		goukei=nyukei+pulukei;
		if(nyumai>=5 && pulumai>=2 ){
			goukei=goukei*4/5;
			System.out.println(goukei);
	}else if(nyumai>=6){
		goukei=goukei-1040;
		System.out.println(goukei);
	}else{
		System.out.println(goukei);
}
}
}
      public static void main(String[] args){
      Main obj = new  Main(); 
      obj.solve();      
  }
}