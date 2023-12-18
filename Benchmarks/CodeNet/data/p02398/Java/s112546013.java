import java.util.Scanner;
public class Main{

    int a,b,c;
    int count;


    public void input(){
	Scanner scan = new Scanner(System.in);
	count = 0;
	a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

	for(int i = a;i <= b;i++){
	    if(c % i == 0){
		count = count + 1;
	    }
	}



    }
    public void output(){
	System.out.println(count);


    }
    



    public static void main(String[] args){
	Main  p = new Main();
	p.input();
       	p.output();
    }
}