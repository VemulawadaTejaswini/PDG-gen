public class Main{
 public static void main(String args[]){
	 Scanner s=new Scanner(System.in);
	 System.out.println("Please enter an integer x");
	 int x=s.nextInt();
	 if(x>=1 && x<=100){
          int result=x*x*x;
		 System.out.println("Cube of a x in aline :"+result);
	 }else{
System.out.println("Please enter an integer x between 1 and 100");
 }
}
}