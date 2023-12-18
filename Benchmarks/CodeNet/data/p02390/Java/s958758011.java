import java.util.*;
class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    void run(){
	int s = sc.nextInt();
	String ans="";
	int a=0;
	while(s>=3600){
	    s -= 3600;
	    a++;
	}
	ans += Integer.toString(a)+":";
	a = 0;
	while(s>=60){
	    s -= 60;
	    a++;
	}
	ans += Integer.toString(a)+":";
	ans += Integer.toString(s);
	System.out.println(ans);
    }
}