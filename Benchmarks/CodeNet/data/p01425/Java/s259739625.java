
package main;
import java.util.Scanner;
import java.math.*;

public class Main {
 static class node
{
      static double l=0.0;
      static double r=0.0;
      static double b=0.0;
      static double t=0.0;
}; 
static node[] p =new node[55];
static final double end = 0.0001;
static int n=0;

public static int solove( double x0,double y0,double t0,double v)
{

           double x,y;
           double g=9.8;
           double t;
           double vx=x0/t0;
           double vy=Math.sqrt(v*v-vx*vx);
                
           double h=vy*t0-g*t0*t0/2;
               
                if(h-y0<=-end)
                   {
		     return 2;
		   }
        
           int  flag=0;

           for(int i=0;i<n;i++)
           {
				
		 if(p[i].l-x0>=end)
		     continue ;
				
		if(p[i].l-x0 <= -end && p[i].r-x0 >=end && p[i].b-h<=-end && p[i].t-y0>=end)
                     return 1;
                
                if(x0-p[i].l>=end)
	           {  
                         x=p[i].l;
                        t=x/vx;
                        y=vy*t-g*t*t/2;
                        if(p[i].b - y <= -end && p[i].t - y >= end)
                                return 1;
		    }
			    
                if(x0-p[i].r>=end)
	            {
		       x=p[i].r;
	               t=x/vx;
	               y=vy*t-g*t*t/2;
	               if(p[i].b - y <= -end&& p[i].t - y >= end)
	                     return 1;
		   }
				
               y=p[i].b;
               double w=vy*vy - 2*g*y;
               if(w>=end)
               {
                       t=(vy-Math.sqrt(w))/g;
                       if(t>end)
                       {

                             x=vx*t;
                         if(x-x0<=end && p[i].l - x <= -end&& p[i].r - x >= end)
                             return 1;
                       }

                       t=(vy+Math.sqrt(w))/g;
                       if(t>end)
                       {

                            x=vx*t;
                            if(x-x0<=end &&p[i].l - x <= -end&& p[i].r- x >= end)
                                    return 1;
                       }
               }
               
               y=p[i].t;
               w=vy*vy - 2*g*y;

               if(w>end)
               {
                       t=(vy-Math.sqrt(w))/g;
                       if(t>end)
                       {

                            x=vx*t;
                            if(x-x0<=end && p[i].l - x <= -end&& p[i].r- x >= end)
                                    return 1;
                       }

                       t=(vy+Math.sqrt(w))/g;
                       if(t>end)
                       {

                                x=vx*t;
                                if(x-x0<=end && p[i].l - x <= -end&& p[i].r- x >= end)
                                        return 1;
                       }
               }
              
           }

    return flag;
}

    public static void main(String[] args)
    {
       
           Scanner cin=new Scanner(System.in);
           double v,x0,y0;
          
           while(cin.hasNext())
           {
                    n=cin.nextInt(); v=cin.nextDouble();
                    x0=cin.nextDouble();y0=cin.nextDouble();
                 
                    for(int i=0;i<n;i++)
                        {
                            p[i].l =cin.nextDouble();p[i].b =cin.nextDouble();
                            p[i].r =cin.nextDouble();p[i].t =cin.nextDouble();
                        }
                 
                    double g=9.8;
                    double f=(v*v - y0*g)*(v*v - y0*g) - g*g*(x0*x0 + y0*y0) ;

                    if(f< -end)
                        {
                                System.out.println("No");
                                continue ;
                        }
                 
                    double u=(  (v*v - y0*g)+Math.sqrt( f  )  )/(g*g)*2;
                    if(u<= -end)
                        {
                                System.out.println("No");
                                continue ;
                        }

		          
                          double t0;
                            t0=Math.sqrt(u);
                            double t2;
                            double t1=0.0;
                              t2=1.0;
                    int  flag=1;  
			  
                    double u1=(  (v*v - y0*g)-Math.sqrt( f  )  )/(g*g)*2;
                    if(u1>=end)
                            t1=Math.sqrt(u1);
		       
                    for( t2=t0;t2>=t1;t2=t2-end )
                            {
                                        flag=solove(x0,y0,t2,v);
                                        if(flag==0 || flag==2)
                                            break;
                            }
                         
                    if(flag!=0)
                        System.out.println("No");
                    else
                        System.out.println("Yes");
     
            }
           }
   }