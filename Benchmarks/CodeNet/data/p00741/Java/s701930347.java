import java.util.Scanner;
import java.util.ArrayDeque;
import java.awt.Point;

public class Main{

public static int psum(int [][]house,int h,int w){
int ret=0;

for(int i=0;i<h;i++){
	for(int j=0;j<w;j++)if(house[j][i]==1)ret++;
}
  return ret;
}
	
public static Point pfound(int [][]house,int h,int w){
for(int i=0;i<h;i++){
  for(int j=0;j<w;j++)if(house[j][i]==1)return new Point(j,i);
}
  return new Point(-1,-1);
}

public static int kukaku(int[][]house,int h,int w){
	int cnt=psum(house,h,w);
	Point[] Dir={new Point(1,0),new Point(1,1),new Point(0,1),new Point(-1,1),new Point(-1,0),new Point(-1,-1),new Point(0,-1),new Point(1,-1)};
	int ret=0;
	ArrayDeque<Point>dq=new ArrayDeque<>();
	while(cnt>0){
		Point fpt=pfound(house,h,w);
		if(fpt.x==-1 && fpt.y==-1)return ret;
		dq.add(fpt);
		ret++;
		
		while(dq.size()>0){
			Point p=dq.removeFirst();
			house[p.x][p.y]=0;
			for(int i=0;i<8;i++){
				Point np=new Point(p.x+Dir[i].x,p.y+Dir[i].y);
			 	int nx=np.x;int ny=np.y;
				if(nx>=0 && nx<w && ny>=0 && ny<h && house[nx][ny]==1){dq.addLast(new Point(nx,ny));
				cnt--;house[nx][ny]=0;
				}
			
			}
		}
		
	}
return ret;
}


public static void main(String []ag){
Scanner sc=new Scanner(System.in);
int h=0,w=0;
do{
	w=sc.nextInt();
	h=sc.nextInt();
	int [][]house=new int[w][h];
	for(int i=0;i<h;i++){
		for(int j=0;j<w;j++)house[j][i]=sc.nextInt();
	}
	int ret=kukaku(house,h,w);
	if(h!=0 || w!=0)System.out.printf("%d\n",ret);
}while(h!=0 || w!=0);

}

}

