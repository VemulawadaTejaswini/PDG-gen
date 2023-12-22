import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int []a = new int[n];
     int []c = new int[9];
     int cn = 0;
     int min = 0; int max = 0;
     for(int i=0; i<n; i++) {
    	a[i] = sc.nextInt(); 
     }
     for(int i=0; i<9; i++) {
     	c[i] = 0; 
      }
 	
	sc.close();
	for(int i=0; i<n; i++) {
      if(1<=a[i]&&a[i]<=399) {c[0]++;}
      if(400<=a[i]&&a[i]<=799) {c[1]++;}
      if(800<=a[i]&&a[i]<=1199) {c[2]++;}
      if(1200<=a[i]&&a[i]<=1599) {c[3]++;}
      if(1600<=a[i]&&a[i]<=1999) {c[4]++;}
      if(2000<=a[i]&&a[i]<=2399) {c[5]++;}
      if(2400<=a[i]&&a[i]<=2799) {c[6]++;}
      if(2800<=a[i]&&a[i]<=3199) {c[7]++;}
      if(3200<=a[i]) {c[8]++;}
      }
	for(int i=0; i<8; i++) {
     	if(c[i] != 0) {cn++;} 
      }
	
	if(cn!=0) {min=cn;}
	if(cn==0) {min=1;}
	
	
	
	 max=cn+c[8];
    
   
	System.out.println(min+" "+max);
   }

}