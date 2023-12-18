
import java.util.Scanner;

 class Main3{
	public void solve(){
		Scanner sc = new Scanner(System.in);
		int x,y,b,p,kin;
	    int n = sc.nextInt();
	    
		for(int i=0; i<n; i++){
			 x=sc.nextInt();
			 y=sc.nextInt();
			 b=sc.nextInt();
			 p=sc.nextInt();
			
			 kin = x*b + y*p;
              
            if(b>=5 && p>=2){
                kin = (x*b + y*p)*4/5;
            }else{
                if(b<5){
                b=5;
                }
                if(p<2){
                p=2;
                }
                int wari = (x*b + y*p)*4/5;
                  
                if(kin>wari){
                    kin = wari;
                }
            }
            System.out.println(kin);
        }
    }
		
	public static void main(String[] args){
        Main3 obj =new Main3();
        obj.solve();
    }
}