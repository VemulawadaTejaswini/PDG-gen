import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
		//BufferedReader br=new BufferedReader(new FileReader("sample.txt"));
		String str=br.readLine();
		String[] st=str.split(" ");
		int n=Integer.parseInt(br.readLine());
		Dice dice1 =new Dice(st);
		for(int i=0;i<n;i++){
			st=br.readLine().split(" ");
			for(int j=0;j<6;j++){
				if(j==3)dice1.roll('E');
				if(st[1].equals(dice1.front))break;
				dice1.roll('N');
			}
			while(true){
				if(st[0].equals(dice1.top))break;
				dice1.roll('W');
			}
			System.out.println(dice1.right);
			}
		
		
	}
	}
class Dice{

String top,front,right,left,back,bot;

	Dice(String[] s){
		top=s[0];
		front=s[1];
		right=s[2];
		left=s[3];
		back=s[4];
		bot=s[5];
	}
		
	void roll(char c){
		String top,bot,back,front,left,right;
		
		top=this.top;bot=this.bot;
		front=this.front;
		back=this.back;
		left=this.left;
		right=this.right;
		
		switch(c){
		case 'N':
			top=this.front;
			bot=this.back;
			front=this.bot;
			back=this.top;
			break;
		
		case 'S':
			top=this.back;
			bot=this.front;
			front=this.top;
			back=this.bot;
			break;
		case 'W':
			top=this.right;
			bot=this.left;
			right=this.bot;
			left=this.top;break;
		
		case 'E':
			top=this.left;
			bot=this.right;
			right=this.top;
			left=this.bot;
			break;
		}
		this.top=top;
		this.front=front;
		this.right=right;
		this.left=left;
		this.back=back;
		this.bot=bot;
		
	}
	String getd1(){return this.top;}
}