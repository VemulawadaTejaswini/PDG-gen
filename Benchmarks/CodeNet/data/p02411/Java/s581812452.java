import java.util.Scanner;
public class Main{
	  public static void judge(int m,int f,int r) {
		 if(m==-1 && f==-1 && r==-1) {
			  System.exit(0);
		  }
		  if(m+f>=80) {
		  System.out.println();
		  System.out.println("A");
	      }
		  if(m+f<80 && m+f>65) {
		  System.out.println();
		  System.out.println("B");
	      }
		  if(m+f<65 && m+f>=50) {
		  System.out.println();
		  System.out.println("C");		 
	      }
		  if(m+f<50 && m+f>=30) {
		  System.out.println();
		  System.out.println("D");
		  }else if(r>=50) {
		  System.out.println();
		  System.out.println("C");
		  }
		  if(m+f<30) {
		  System.out.println();
		  System.out.println("F");
		  }
		 
	}
		  
	  public static void main(String[] args) {
		  Scanner x = new Scanner(System.in);
		  for(;;) {
		  int data [] = new int[3];
		  for(int i = 0;i<3;i++) {
				data[i]=x.nextInt();
			}
		 
		 judge(data[0],data[1],data[2]);
		  }
	  }
	}
