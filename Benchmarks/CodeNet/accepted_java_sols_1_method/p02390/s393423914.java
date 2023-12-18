import java.util.Scanner;                      
                                               
 class Main {                                  
    public static void main(String[] args) {   
     Scanner scanner = new Scanner(System.in);      
     int s = scanner.nextInt();
     int a = s/3600;
     int b = s%3600/60;
     int c = s%3600%60;	 
     System.out.println( a+":"+ b +":"+c);
     scanner.close();
    }                                          
 }        
