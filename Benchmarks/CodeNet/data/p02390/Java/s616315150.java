import java.util.Scanner;
public class Main{

    int S;

    public void input(){
	Scanner scan = new Scanner(System.in);
	S = scan.nextInt();
        
    }
 


    public void output(){
        System.out.println(S/3600+":"+(S%3600)/60+":"+(S%3600)%60);
    }
 public static void main(String[] args){
     Main p = new Main();
     p.input();
     p.output();
 }
}
  