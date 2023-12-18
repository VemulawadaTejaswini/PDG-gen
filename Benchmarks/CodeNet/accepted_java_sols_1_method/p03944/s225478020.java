    import java.util.Scanner;
    public class Main {
    	public static void main(String[] args) {
    		Scanner sc=new Scanner(System.in);
    		int w=0,h=0,ww=sc.nextInt(),hh=sc.nextInt(),n=sc.nextInt();
    		for(int i=0;i<n;i++) {
    			int x=sc.nextInt(),y=sc.nextInt(),a=sc.nextInt();
    			if(a==1&&w<x)w=x;
    			if(a==2&&x<ww)ww=x;
    			if(a==3&&h<y)h=y;
    			if(a==4&&y<hh)hh=y;
    		}
    		System.out.println(w<ww&&h<hh?(ww-w)*(hh-h):0);
    		sc.close();
    	}
    }