import java.util.Scanner;
class Line{
    protected int[][] liner;
    protected int[] beq;
    protected int sum;
    public Line(int x,int y){
	liner=new int[x][];
	for(int i=0;i<x;i++) liner[i]=new int[y];
	beq=new int[y];
    }
    public void calc(int x,int y){
	for(int i=0;i<x;i++){
	    sum=0;
	    for(int j=0;j<y;j++){
		sum+=liner[i][j]*beq[j];
	    }
	    System.out.println(sum);
	}
    }
}

class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	Line line=new Line(x,y);
	for(int i=0;i<x;i++){
	    for(int j=0;j<y;j++){
		line.liner[i][j]=sc.nextInt();
	    }
	}
	for(int i=0;i<y;i++) line.beq[i]=sc.nextInt();
	line.calc(x,y);
    }
}