import java.util.Scanner;

public class Main{
	
	static final Scanner s=new Scanner(System.in);
	
	public static void main(String args[]){
		Dice d=new Dice();
		for(int i=0;i<6;i++)
			d.v[i]=s.nextInt();
		for(char c:s.next().toCharArray())
			d.roll(c);
		System.out.println(d.v[0]);
	}
}
class Dice{
	public int v[] = {1,2,3,4,5,6};
	/*
	   ####
	  #1 ##
	 #  # #
	####3 #
	#2 # #
	#  ##
	####
	
	*/
	public Dice(){
	}
	
	public void roll(char direction){
		int buf=v[0];
		switch(direction){
		case 'n':
		case 'N':
			v[0]=v[1];
			v[1]=v[5];
			v[5]=v[4];
			v[4]=buf;
			return;
		case 's':
		case 'S':
			v[0]=v[4];
			v[4]=v[5];
			v[5]=v[1];
			v[1]=buf;
			return;
		case 'e':
		case 'E':
			v[0]=v[3];
			v[3]=v[5];
			v[5]=v[2];
			v[2]=buf;
			return;
		case 'w':
		case 'W':
			v[0]=v[2];
			v[2]=v[5];
			v[5]=v[3];
			v[3]=buf;
			return;
		default:
			throw new IllegalArgumentException("Illeagal direction");
		}
	}
}