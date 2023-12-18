import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double x=in.nextDouble(),y=in.nextDouble();
		double a=y/(x*2),b=y;
		List<position> S=new ArrayList<>();
		
		for(double i=0;i<=x*2;i+=2){
			position p=new position();
			p.x=i;
			p.y=b-(a*i);
			//System.out.println(p.x+" "+p.y);
			S.add(p);
		}
		
		for(double i=0;i<=y;i++){
			position p=new position();
			p.x=(b-i)/a;
			p.y=i;
			//System.out.println(p.x+" "+p.y);
			
			boolean jd=true;
			for(int j=0;j<S.size();j++){
				position c=S.get(j);
				if((p.x==c.x) || (p.y==c.y)){
					jd=false;
					break;
				}
			}
			if(jd)S.add(p);
		}
		
		System.out.println(S.size());
	}

}

class position{
	double x,y;
}

