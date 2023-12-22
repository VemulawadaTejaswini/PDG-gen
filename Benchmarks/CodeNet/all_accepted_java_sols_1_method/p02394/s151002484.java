import java.util.Scanner;

class Main{
    public  static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int x = stdIn.nextInt(); //長方形　X座標
	int y = stdIn.nextInt(); //長..    Y ..
	int s = stdIn.nextInt(); //円..   X.. 
	int t = stdIn.nextInt();// 円..　　Y..
	int r = stdIn.nextInt();// 円　半径

	//有効な範囲を考える
	if(s >= r&& s <= (x - r) && t >= r && t <= (y - r))
	    System.out.println("Yes");
	else
	    System.out.println("No");

	
    }
    
}