import std.stdio;
import std.string;
import std.conv;
import std.math;

int main()
{
	int n;
	readf("%f",&n);

	foreach(int i;0..n)
	{
		double x1,y1,x2,y2,x3,y3;
		readf("%f %f %f %f %f %f",&x1,&y1,&x2,&y2,&x3,&y3);

		double a1 = 2*(x2 - x1);
		double b1 = 2*(y2 - y1);
		double c1 = x1*x1 - x2*x2 + y1*y1 - y2*y2;
		
		double a2 = 2*(x3 -x1);
		double b2 = 2*(y3 - y1);
		double c2 = x1*x1 - x3*x3 + y1*y1 - y3*y3;
		
		double x = (b1*c2 - b2*c1) / (a1*b2 - a2*b1);
		double y = (c1*a2 - c2*a1) / (a1*b2 - a2*b1);
		
		double r_2 = (x1 - x)*(x1 - x) + (y1 - y)*(y1 - y);
		double r = sqrt(r_2);

		printf("%.3lf %.3lf %.3lf\n",x,y,r);
	}

	return 0;
}