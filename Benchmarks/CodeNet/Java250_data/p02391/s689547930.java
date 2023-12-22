import java.util.Scanner;
public class Main{

    int a,b;

    public void input(){
	Scanner scan = new Scanner(System.in);
	a = scan.nextInt();
        b = scan.nextInt();
        
    }
 


    public void output(){
	if(a > b){
	    System.out.println("a > b");
	}else if(a < b){
            System.out.println("a < b");
        }else{
            System.out.println("a == b");
	} 
      
    }
 public static void main(String[] args){
     Main p = new Main();
     p.input();
     p.output();
 }
}
  