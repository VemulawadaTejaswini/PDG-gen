public class Main{
  static public void main(String[] args){
  	
  	 java.util.Scanner scan = new java.util.Scanner(System.in);

  	
  	int n = scan.nextInt();
    int x = scan.nextInt();
  	int t = scan.nextInt();
  	int result;
  	/*
  	int n = Integer.parseInt(args[0]);
    int x = Integer.parseInt(args[1]);
  	int t = Integer.parseInt(args[2]);
    int result;
  	*/
  	if(n%x != 0){
  		result = (((int)(n/x))+1)*t;
  		
  	}else{
  		result = ((int)(n/x))*t;
  	}
  	System.out.println(result);
  	
  }
}