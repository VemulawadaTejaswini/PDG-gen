import java.util.Scanner;
public class Main{
    int max;
    int min;
    int sa;
	
    public void solve(){
		Scanner sc =new Scanner(System.in);
		for(int i=0; i<7; i++){
		max=sc.nextInt();
		min=sc.nextInt();   
		sa=max-min;
		System.out.println(sa);
			 }
    }
       public static void main(String[] args){
      Main obj = new  Main(); 
      obj.solve();      
  }
}