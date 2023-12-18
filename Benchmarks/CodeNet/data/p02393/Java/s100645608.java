import java.util.Scanner;
class Main {
	public static void main(String[] args){
		 Scanner scn = new Scanner(System.in);
		    int a = scn.nextInt();
		    int b = scn.nextInt();
		    int c = scn.nextInt();

	    	 if(c>b&b>a){
			     System.out.print(a+" "+b+" "+c);
			 }
			 if(b>c&c>a){
				 System.out.print(a+" "+c+" "+b);
			 }
			 if(a>c&c>b){
				 System.out.print(b+" "+c+" "+a);
			 }
			 if(c>a&a>b){
				 System.out.print(b+" "+a+" "+c);
			 }
			 if(b>a&a>c){
				 System.out.print(c+" "+a+" "+b);
			 }
			 if(a>b&b>c){
				 System.out.print(c+" "+b+" "+a);
			 }
			 if(a==b&b==c){
				 System.out.print(a+" "+a+" "+a);
			 }
			 if(a==b&b>c){
				 System.out.print(c+" "+a+" "+a);
			 }
			 if(a==b&c>b){
				 System.out.print(a+" "+a+" "+c);
			 }

			 if(a>c&b==c){
				 System.out.print(b+" "+b+" "+a);
			 }
			 if(c>a&b==c){
				 System.out.println(a+" "+b+" "+b);
			 }
	}
}