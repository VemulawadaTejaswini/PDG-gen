import java.util.Scanner; 
 class Main {

	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=0;
		int c=0,x=10000000,y=-10000000,z=0;
		while(c<a){
			b=stdIn.nextInt();
			if(b<=x)
				x=b;
			if(b>=y)
				y=b;
			z+=b;
			c++;
		}
		System.out.println(x+" "+y+" "+z);
	}

}