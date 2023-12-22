class Main{public static void main(String[]g)throws Exception{double y=1e5;int n=0,i;for(;(i=System.in.read())>32;n=n*10+i-48);for(i=1000;n-->0;y+=y%i>0?i-y%i:0)y*=1.05;System.out.println((int)y);}}
