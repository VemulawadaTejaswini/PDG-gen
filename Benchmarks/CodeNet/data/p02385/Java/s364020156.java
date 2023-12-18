import java.util.Scanner;

class Dice {
	int up;
	int front;
	int right;
	private int left;
	private int back;
	private int down;
	
	Dice(int up,int front,int right,int left,int back,int down){
		this.up=up;	this.front=front; this.right=right;
		this.left=left; this.back=back; this.down=down;
	}
	
	void printRight(){	System.out.println(right); }
	
	void rotate(char c){
		int temp;
		if(c=='E'){
			temp=up; up=left; left=down; down=right; right=temp;
		}
		
		if(c=='N'){
			temp=up; up=front; front=down; down=back; back=temp;
		}
		
		if(c=='S'){
			temp=up; up=back; back=down; down=front; front=temp;
		}
		
		if(c=='W'){
			temp=up; up=right; right=down; down=left; left=temp;
		}
	}
	
	void all_rotate(int u,int f,int r){
		for(int i=0;i<4;i++){
			rotate('E');
			for(int j=0;j<4;j++){
				rotate('N');
				for(int k=0;k<4;k++){
					rotate('E');
					if(up==u && front==f && right==r){
						System.out.println("Yes");
						return;
					}
				}
			}
		}
		System.out.println("No");
	}
			
}


class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		Dice a=new Dice(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		Dice b=new Dice(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		
		b.all_rotate(a.up,a.front,a.right);
		
	}
}
