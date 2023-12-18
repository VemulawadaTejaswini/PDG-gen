import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	for(int a=1;;a++){
	    Polygo pol =new Polygo();
	    int n=sc.nextInt();
	    if(n==0)break;
	    for(int i=0;i<n;i++){
		pol.addXY(sc.nextDouble(),sc.nextDouble());
	    }
	    System.out.println(a+" "+Math.abs(pol.getArea()));
	}
    }
    
}
class Polygo
{
    ArrayList<Double> x=new ArrayList<Double>();
    ArrayList<Double> y=new ArrayList<Double>();
    Polygo()
    {
    }
    public void addXY(double x,double y)
    {
	this.x.add(x);
	this.y.add(y);
    }
    public StringBuffer getX()
    {
	StringBuffer s= new StringBuffer();
	for(int i=0;i<x.size();i++){
	    s.append(x.get(i));
	    s.append(" ");
	}
	return s;
    }
    public StringBuffer getY()
    {
	StringBuffer s= new StringBuffer();
	for(int i=0;i<y.size();i++){
	    s.append(y.get(i));
	    s.append(" ");
	}
	return s;
    }
    public double getArea()
    {
	double S=0;
	double[] x1=new double[2];
	double[] y1=new double[2];
	int d[]={1,0};
	
	x1[0]=x.get(0);
	y1[0]=y.get(0);
      
	for(int i=1;i<x.size();i++){
	    x1[i%2]=x.get(i);
	    y1[i%2]=y.get(i);
	    S+=(x1[d[i%2]]-x1[i%2])*(y1[d[i%2]]+y1[i%2]);
	}
	S+=(x.get(x.size()-1)-x.get(0))*(y.get(x.size()-1)+y.get(0));
	
	return S/2;
	
    }
}