import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long o=0;
        long n=sc.nextLong();
      	int a0=sc.nextInt();
      	System.out.print("0 ");
      	String bit0=String.format("%32s",Integer.toBinaryString(a0)).replace(" ", "0");
      	for(long i=0;i<n-1;i++){
		  int a1=sc.nextInt();
          String bit1=String.format("%32s",Integer.toBinaryString(a1)).replace(" ", "0");
          String result="";
          for(int j=0;j<32;j++){
          	if(bit0.charAt(j)!=bit1.charAt(j))result+="1";
            else result+="0";
          }
          o=Integer.parseInt(result, 2);
          System.out.print(o+" ");
        }         
        
    }
    
}