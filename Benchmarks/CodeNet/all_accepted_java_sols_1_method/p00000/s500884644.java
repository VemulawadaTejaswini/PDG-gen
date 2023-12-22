public class Main {
	 public static void main(String[] a){
		 int x =1;
		 int y =1;
		 System.out.println(x + "x" + y + "=" + x * y);
		 
		 while(x < 10){
			 if(y<9){
				 y = y +1;
				 System.out.println(x + "x" + y + "=" + x * y);
			 }
			 
			 else if(y == 9 && x < 9){
				 y = 1;
				 x = x +1;
				 System.out.println(x + "x" + y + "=" + x * y);
			 }
			 
			 else{
				 break;
			 }
		
		 }
	 }
}