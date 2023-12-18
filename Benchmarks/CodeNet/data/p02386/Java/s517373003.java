import java.util.Scanner;

class Dice {
	int up;
	int front;
	int right;
	int left;
	int back;
	int down;
	
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
	
	boolean all_rotate(int u,int f,int r,int l,int b,int d){
		for(int i=0;i<4;i++){
			rotate('E');
			for(int j=0;j<4;j++){
				rotate('N');
				for(int k=0;k<4;k++){
					rotate('E');
					if(up==u && front==f && right==r && left==l && back==b && down==d){
						return false;
					}
				}
			}
		}
		return true;
	}
			
}


class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		Dice[] a=new Dice[100];
		
		int n=scan.nextInt();
		boolean flg=true;
		for(int i=0;i<n;i++){
			int[] num=new int[6];
			for(int j=0;j<6;j++)
				num[i]=scan.nextInt();
			a[i]=new Dice(num[0],num[1],num[2],num[3],num[4],num[5]);
			
			if(flg){
				for(int j=0;j<i;j++){
					flg=a[j].all_rotate(a[i].up,a[i].front,a[i].right,a[i].left,a[i].back,a[i].down);
					//if(flg==false)System.out.println("i:"+i+" j:"+j);
				}
				
			}
		}
		
		if(flg)
			System.out.println("Yes");
		else 
			System.out.println("No");
		
	}
}
