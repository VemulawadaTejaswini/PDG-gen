import java.util.Scanner;                      
                                               
 class Main {                                  
    public static void main(String[] args) {   
     Scanner scanner = new Scanner(System.in);      

     int a=0;
     int b=0;
     int c=0;
     int d=0;
	    a = scanner.nextInt();
	    b = scanner.nextInt();
	    c = scanner.nextInt();

     for(int i=a ; i<=b;i++){
    	 if(c%i == 0){
    		 d++;}
    		
     }
System.out.println(d);
     scanner.close();
    }                                          
 }  
                 

